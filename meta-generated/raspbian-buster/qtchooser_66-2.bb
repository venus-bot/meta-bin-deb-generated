PACKAGES = "${PN} qtchooser"
PROVIDES = "qtchooser"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/q/qtchooser/qtchooser_66-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_qtchooser = "qtchooser_66-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "19605ca64a8ba979f0f85baf8cb4e80a848ae1b73bba9edcc6ae28918336de17"
SRC_URI[deb0.md5sum] = "a3c8ee4b5faf74455dd72d1af4019ab5"

RDEPENDS_${PN} = "libc6 (>= 2.4) libgcc1 (>= 1:3.5) libstdc++6 (>= 5.2)"
DEPENDS = "libc6 libgcc1 libstdc++6"


inherit deb_group

FILES_${PN} = " \
    ./usr/bin/assistant \
    ./usr/bin/designer \
    ./usr/bin/lconvert \
    ./usr/bin/linguist \
    ./usr/bin/lrelease \
    ./usr/bin/lupdate \
    ./usr/bin/moc \
    ./usr/bin/pixeltool \
    ./usr/bin/qcollectiongenerator \
    ./usr/bin/qdbus \
    ./usr/bin/qdbuscpp2xml \
    ./usr/bin/qdbusviewer \
    ./usr/bin/qdbusxml2cpp \
    ./usr/bin/qdoc \
    ./usr/bin/qdoc3 \
    ./usr/bin/qgltf \
    ./usr/bin/qhelpconverter \
    ./usr/bin/qhelpgenerator \
    ./usr/bin/qlalr \
    ./usr/bin/qmake \
    ./usr/bin/qml \
    ./usr/bin/qml1plugindump \
    ./usr/bin/qmlbundle \
    ./usr/bin/qmlcachegen \
    ./usr/bin/qmleasing \
    ./usr/bin/qmlimportscanner \
    ./usr/bin/qmljs \
    ./usr/bin/qmllint \
    ./usr/bin/qmlmin \
    ./usr/bin/qmlplugindump \
    ./usr/bin/qmlprofiler \
    ./usr/bin/qmlscene \
    ./usr/bin/qmltestrunner \
    ./usr/bin/qmlviewer \
    ./usr/bin/qtattributionsscanner \
    ./usr/bin/qtchooser \
    ./usr/bin/qtconfig \
    ./usr/bin/qtdiag \
    ./usr/bin/qtpaths \
    ./usr/bin/qtplugininfo \
    ./usr/bin/qvkgen \
    ./usr/bin/rcc \
    ./usr/bin/repc \
    ./usr/bin/uic \
    ./usr/bin/uic3 \
    ./usr/bin/xmlpatterns \
    ./usr/bin/xmlpatternsvalidator \
    ./usr/lib/arm-linux-gnueabihf/qtchooser/4.conf \
    ./usr/lib/arm-linux-gnueabihf/qtchooser/5.conf \
    ./usr/lib/arm-linux-gnueabihf/qtchooser/qt4.conf \
    ./usr/lib/arm-linux-gnueabihf/qtchooser/qt5.conf \
    ./usr/share/doc/qtchooser/README.Debian \
    ./usr/share/doc/qtchooser/changelog.Debian.gz \
    ./usr/share/doc/qtchooser/copyright \
    ./usr/share/lintian/overrides/qtchooser \
    ./usr/share/man/man1/qtchooser.1.gz \
    ./usr/share/qtchooser/qt4-arm-linux-gnueabihf.conf \
    ./usr/share/qtchooser/qt5-arm-linux-gnueabihf.conf\
"
