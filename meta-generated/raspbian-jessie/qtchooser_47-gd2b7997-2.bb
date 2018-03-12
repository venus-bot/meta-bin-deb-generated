PACKAGES = "${PN} qtchooser"
PROVIDES = "qtchooser"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/q/qtchooser/qtchooser_47-gd2b7997-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_qtchooser = "qtchooser_47-gd2b7997-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "2a9ea6f498ff141138af7a5c07128a0acce21c4d75775f3c256c77cf0649d010"
SRC_URI[deb0.md5sum] = "d44640e3e691e6e5d7dabc65d83483af"

RDEPENDS_${PN} = "libc6 (>= 2.4) libgcc1 (>= 1:4.4.0) libstdc++6 (>= 4.9)"
DEPENDS = "libc6 libgcc1 libstdc++6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
    ./usr/bin/qtconfig \
    ./usr/bin/qhelpgenerator \
    ./usr/bin/qtpaths \
    ./usr/bin/qdoc \
    ./usr/bin/uic3 \
    ./usr/bin/qmake \
    ./usr/bin/rcc \
    ./usr/share/doc/qtchooser/README.Debian \
    ./usr/bin/qmlprofiler \
    ./usr/share/lintian/overrides/qtchooser \
    ./usr/bin/qmlviewer \
    ./usr/bin/xmlpatterns \
    ./usr/bin/pixeltool \
    ./usr/bin/qmlplugindump \
    ./usr/bin/qdbusxml2cpp \
    ./usr/bin/qdbusviewer \
    ./usr/share/doc/qtchooser/copyright \
    ./usr/share/doc/qtchooser/changelog.Debian.gz \
    ./usr/bin/designer \
    ./usr/bin/qml1plugindump \
    ./usr/bin/qtdiag \
    ./usr/bin/qmltestrunner \
    ./usr/bin/qdbuscpp2xml \
    ./usr/bin/lrelease \
    ./usr/bin/lupdate \
    ./usr/bin/qmlbundle \
    ./usr/bin/qtchooser \
    ./usr/bin/uic \
    ./usr/bin/qcollectiongenerator \
    ./usr/bin/qdoc3 \
    ./usr/bin/qml \
    ./usr/bin/qmlscene \
    ./usr/bin/qhelpconverter \
    ./usr/bin/qdbus \
    ./usr/bin/qmlmin \
    ./usr/bin/xmlpatternsvalidator \
    ./usr/bin/assistant \
    ./usr/bin/moc \
    ./usr/share/man/man1/qtchooser.1.gz \
    ./usr/bin/qglinfo \
    ./usr/bin/qmlimportscanner \
    ./usr/bin/lconvert \
    ./usr/bin/qlalr \
    ./usr/bin/linguist\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
