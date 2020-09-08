PACKAGES = "${PN} libxcb-render0 libxcb-shm0 libxcb1 libxcb1-dev"
PROVIDES = "libxcb-render0 libxcb-shm0 libxcb1 libxcb1-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxcb/libxcb-render0_1.13.1-2_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/libx/libxcb/libxcb-shm0_1.13.1-2_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/libx/libxcb/libxcb1_1.13.1-2_armhf.deb;unpack=0;name=deb2\
	http://archive.raspbian.org/raspbian/pool/main/libx/libxcb/libxcb1-dev_1.13.1-2_armhf.deb;unpack=0;name=deb3\
"
DEBFILENAME_libxcb-render0 = "libxcb-render0_1.13.1-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "842d08da35fd84d9c52d189bb412fc238ada6391da803f4e8a3bc8f9dddeded0"
SRC_URI[deb0.md5sum] = "4aa4c4149f327c14a8055d1ddf889a33"
DEBFILENAME_libxcb-shm0 = "libxcb-shm0_1.13.1-2_armhf.deb"
SRC_URI[deb1.sha256sum] = "d6d35c9e57153832d88a521eb22acb19639e80003de7f3d9c834162fe8e4b5da"
SRC_URI[deb1.md5sum] = "d86dc13c48cd9adaa318bd30c49f3102"
DEBFILENAME_libxcb1 = "libxcb1_1.13.1-2_armhf.deb"
SRC_URI[deb2.sha256sum] = "9be3930e901f475e377dd0b3fb598d785826699be1e0e4cb1b4c24ed0ad3a46d"
SRC_URI[deb2.md5sum] = "f6f5bf6ffc8e1be82f9de58582ce5aaf"
DEBFILENAME_libxcb1-dev = "libxcb1-dev_1.13.1-2_armhf.deb"
SRC_URI[deb3.sha256sum] = "04668c3f6bdcf66ab70210ba281603b32a22cfeff8fb8f100d8c1682813915a8"
SRC_URI[deb3.md5sum] = "990b399ec0b443cf50ff6fe0eebaf9f1"

RDEPENDS_${PN}-render0 = "libc6 (>= 2.4) libxcb1 (>= 1.8)"
RDEPENDS_${PN}-shm0 = "libc6 (>= 2.4) libxcb1 (>= 1.12)"
RDEPENDS_${PN}1 = "libc6 (>= 2.4) libxau6 libxdmcp6"
RDEPENDS_${PN}1-dev = "libpthread-stubs0-dev libxau-dev (>= 1:1.0.0-1) libxcb1 (= 1.13.1-2) libxdmcp-dev (>= 1:1.0.0-1)"
DEPENDS = "libc6 libpthread-stubs0-dev libxau-dev libxau6 libxdmcp-dev libxdmcp6"


inherit deb_group

FILES_libxcb-render0 = " \
    ./usr/lib/arm-linux-gnueabihf/libxcb-render.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libxcb-render.so.0.0.0 \
    ./usr/share/doc/libxcb-render0/changelog.Debian.gz \
    ./usr/share/doc/libxcb-render0/changelog.gz \
    ./usr/share/doc/libxcb-render0/copyright\
"
FILES_libxcb-shm0 = " \
    ./usr/lib/arm-linux-gnueabihf/libxcb-shm.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libxcb-shm.so.0.0.0 \
    ./usr/share/doc/libxcb-shm0/changelog.Debian.gz \
    ./usr/share/doc/libxcb-shm0/changelog.gz \
    ./usr/share/doc/libxcb-shm0/copyright\
"
FILES_libxcb1 = " \
    ./usr/lib/arm-linux-gnueabihf/libxcb.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libxcb.so.1.1.0 \
    ./usr/share/doc/libxcb1/changelog.Debian.gz \
    ./usr/share/doc/libxcb1/changelog.gz \
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
    ./usr/share/doc/libxcb1-dev/changelog.Debian.gz \
    ./usr/share/doc/libxcb1-dev/changelog.gz \
    ./usr/share/doc/libxcb1-dev/copyright\
"
