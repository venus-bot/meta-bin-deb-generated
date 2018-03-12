PACKAGES = "${PN} qtchooser"
PROVIDES = "qtchooser"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/q/qtchooser/qtchooser_47-gd2b7997-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_qtchooser = "qtchooser_47-gd2b7997-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "cda683616a71de9314479dfcf55bbd2226487e182bf3abf087c59a0e87825af6"
SRC_URI[deb0.md5sum] = "c55313671bb2d0d2282584fa3853a484"

RDEPENDS_${PN} = "libc6 (>= 2.4) libgcc1 (>= 1:4.4.0) libstdc++6 (>= 4.9)"
DEPENDS = "libgcc1 libc6 libstdc++6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
    ./usr/bin/qdbus \
    ./usr/bin/qdbusviewer \
    ./usr/bin/pixeltool \
    ./usr/bin/lupdate \
    ./usr/bin/qmake \
    ./usr/bin/uic \
    ./usr/bin/designer \
    ./usr/bin/qmlimportscanner \
    ./usr/bin/qmlplugindump \
    ./usr/bin/uic3 \
    ./usr/bin/assistant \
    ./usr/bin/qdoc3 \
    ./usr/bin/xmlpatternsvalidator \
    ./usr/bin/qmlprofiler \
    ./usr/bin/lrelease \
    ./usr/bin/xmlpatterns \
    ./usr/bin/qmltestrunner \
    ./usr/bin/qtconfig \
    ./usr/bin/qglinfo \
    ./usr/bin/qml \
    ./usr/share/man/man1/qtchooser.1.gz \
    ./usr/bin/qcollectiongenerator \
    ./usr/bin/qhelpgenerator \
    ./usr/share/doc/qtchooser/copyright \
    ./usr/share/doc/qtchooser/README.Debian \
    ./usr/bin/qtchooser \
    ./usr/share/lintian/overrides/qtchooser \
    ./usr/bin/qlalr \
    ./usr/bin/moc \
    ./usr/bin/qdbuscpp2xml \
    ./usr/bin/rcc \
    ./usr/bin/qdbusxml2cpp \
    ./usr/bin/qhelpconverter \
    ./usr/bin/linguist \
    ./usr/bin/qmlmin \
    ./usr/bin/qmlbundle \
    ./usr/bin/qmlviewer \
    ./usr/bin/lconvert \
    ./usr/share/doc/qtchooser/changelog.Debian.gz \
    ./usr/bin/qmlscene \
    ./usr/bin/qtpaths \
    ./usr/bin/qml1plugindump \
    ./usr/bin/qdoc \
    ./usr/bin/qtdiag\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
