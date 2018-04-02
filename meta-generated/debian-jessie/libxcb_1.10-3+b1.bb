PACKAGES = "${PN} libxcb-render0 libxcb-shm0 libxcb1 libxcb1-dev"
PROVIDES = "libxcb-render0 libxcb-shm0 libxcb1 libxcb1-dev"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libx/libxcb/libxcb-render0_1.10-3+b1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/libx/libxcb/libxcb-shm0_1.10-3+b1_armhf.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/libx/libxcb/libxcb1_1.10-3+b1_armhf.deb;unpack=0;name=deb2\
	http://ftp.de.debian.org/debian/pool/main/libx/libxcb/libxcb1-dev_1.10-3+b1_armhf.deb;unpack=0;name=deb3\
"
DEBFILENAME_libxcb-render0 = "libxcb-render0_1.10-3+b1_armhf.deb"
SRC_URI[deb0.sha256sum] = "bd4a65e3ba27524d8edf3748cb708ba0611336995af5392a4eb5403455854fde"
SRC_URI[deb0.md5sum] = "e7faa30b69fae7dd5ab8cd1142c77446"
DEBFILENAME_libxcb-shm0 = "libxcb-shm0_1.10-3+b1_armhf.deb"
SRC_URI[deb1.sha256sum] = "06afbb573b6b9deda981e22f9bbaba581c95f47f6749421bd7bf88339b963c9c"
SRC_URI[deb1.md5sum] = "8ace9ff3c3d3ad3b00fb565f5af98189"
DEBFILENAME_libxcb1 = "libxcb1_1.10-3+b1_armhf.deb"
SRC_URI[deb2.sha256sum] = "6f5c3a6e93329e4786b12be4d055f20ebaa5a2c0a90aabee070a1fbe3825fe67"
SRC_URI[deb2.md5sum] = "a0f783bfbf449d5e658bea0c73fd75b6"
DEBFILENAME_libxcb1-dev = "libxcb1-dev_1.10-3+b1_armhf.deb"
SRC_URI[deb3.sha256sum] = "6cef447558a3921f46f2a85ece415d2d3aa4fdb17f0377922649fec0914c8068"
SRC_URI[deb3.md5sum] = "dfeb673e04baedaf449cdea1f2a16865"

RDEPENDS_${PN}-render0 = "libc6 (>= 2.4) libxcb1 (>= 1.8)"
RDEPENDS_${PN}-shm0 = "libc6 (>= 2.4) libxcb1 (>= 1.9.2)"
RDEPENDS_${PN}1 = "libc6 (>= 2.4) libxau6 libxdmcp6"
RDEPENDS_${PN}1-dev = "libxcb1 (= 1.10-3+b1) libpthread-stubs0-dev libxau-dev (>= 1:1.0.0-1) libxdmcp-dev (>= 1:1.0.0-1)"
DEPENDS = "libxau6 libxdmcp6 libxau-dev libc6 libxdmcp-dev libpthread-stubs0-dev"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libxcb-render0 = " \
    ./usr/lib/arm-linux-gnueabihf/libxcb-render.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libxcb-render.so.0.0.0 \
    ./usr/share/doc/libxcb-render0/changelog.Debian.armhf.gz \
    ./usr/share/doc/libxcb-render0/changelog.Debian.gz \
    ./usr/share/doc/libxcb-render0/copyright\
"
FILES_libxcb-shm0 = " \
    ./usr/lib/arm-linux-gnueabihf/libxcb-shm.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libxcb-shm.so.0.0.0 \
    ./usr/share/doc/libxcb-shm0/changelog.Debian.armhf.gz \
    ./usr/share/doc/libxcb-shm0/changelog.Debian.gz \
    ./usr/share/doc/libxcb-shm0/copyright\
"
FILES_libxcb1 = " \
    ./usr/lib/arm-linux-gnueabihf/libxcb.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libxcb.so.1.1.0 \
    ./usr/share/doc/libxcb1/changelog.Debian.armhf.gz \
    ./usr/share/doc/libxcb1/changelog.Debian.gz \
    ./usr/share/doc/libxcb1/copyright\
"
FILES_libxcb1-dev = " \
    ./usr/include/xcb/bigreq.h \
    ./usr/include/xcb/xc_misc.h \
    ./usr/include/xcb/xcb.h \
    ./usr/include/xcb/xcbext.h \
    ./usr/include/xcb/xproto.h \
    ./usr/lib/arm-linux-gnueabihf/libxcb.a \
    ./usr/lib/arm-linux-gnueabihf/libxcb.so \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/xcb.pc \
    ./usr/share/doc/libxcb1-dev/changelog.Debian.armhf.gz \
    ./usr/share/doc/libxcb1-dev/changelog.Debian.gz \
    ./usr/share/doc/libxcb1-dev/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
