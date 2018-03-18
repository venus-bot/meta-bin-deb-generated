PACKAGES = "${PN} libxcb-render0 libxcb-shm0 libxcb1 libxcb1-dev"
PROVIDES = "libxcb-render0 libxcb-shm0 libxcb1 libxcb1-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxcb/libxcb-render0_1.10-3_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/libx/libxcb/libxcb-shm0_1.10-3_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/libx/libxcb/libxcb1_1.10-3_armhf.deb;unpack=0;name=deb2\
	http://archive.raspbian.org/raspbian/pool/main/libx/libxcb/libxcb1-dev_1.10-3_armhf.deb;unpack=0;name=deb3\
"
DEBFILENAME_libxcb-render0 = "libxcb-render0_1.10-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "c9338b80931559cb3e1d8ecf6cf680d98a1b366bcd9d9ccb8485e97c79352fa9"
SRC_URI[deb0.md5sum] = "2dab5124b28b07bbdb47ebd095dd96a7"
DEBFILENAME_libxcb-shm0 = "libxcb-shm0_1.10-3_armhf.deb"
SRC_URI[deb1.sha256sum] = "ff991c79238a7b2019031a5471ac229357b3efabbb9212c59088fe317ab258df"
SRC_URI[deb1.md5sum] = "8c90d73d84e4989311bf41a14a31f0fc"
DEBFILENAME_libxcb1 = "libxcb1_1.10-3_armhf.deb"
SRC_URI[deb2.sha256sum] = "382078e38fe65bccd47438fd95729a095af132e8e5a1f2c4408914d54dcc7658"
SRC_URI[deb2.md5sum] = "c9a08426f3fdc3e28912228793aa7a8b"
DEBFILENAME_libxcb1-dev = "libxcb1-dev_1.10-3_armhf.deb"
SRC_URI[deb3.sha256sum] = "9708671be94e8a1565a99c4ca375623571d6ca5c62e480a928919ebc00b8557b"
SRC_URI[deb3.md5sum] = "bc3bbbd78897f528764d23bf49fa13ff"

RDEPENDS_${PN}-render0 = "libc6 (>= 2.4) libxcb1 (>= 1.8)"
RDEPENDS_${PN}-shm0 = "libc6 (>= 2.4) libxcb1 (>= 1.9.2)"
RDEPENDS_${PN}1 = "libc6 (>= 2.4) libxau6 libxdmcp6"
RDEPENDS_${PN}1-dev = "libxcb1 (= 1.10-3) libpthread-stubs0-dev libxau-dev (>= 1:1.0.0-1) libxdmcp-dev (>= 1:1.0.0-1)"
DEPENDS = "libc6 libxau6 libxdmcp6 libpthread-stubs0-dev libxdmcp-dev libxau-dev"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libxcb-render0 = " \
    ./usr/lib/arm-linux-gnueabihf/libxcb-render.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libxcb-render.so.0.0.0 \
    ./usr/share/doc/libxcb-render0/changelog.Debian.gz \
    ./usr/share/doc/libxcb-render0/copyright\
"
FILES_libxcb-shm0 = " \
    ./usr/lib/arm-linux-gnueabihf/libxcb-shm.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libxcb-shm.so.0.0.0 \
    ./usr/share/doc/libxcb-shm0/changelog.Debian.gz \
    ./usr/share/doc/libxcb-shm0/copyright\
"
FILES_libxcb1 = " \
    ./usr/lib/arm-linux-gnueabihf/libxcb.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libxcb.so.1.1.0 \
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
    ./usr/share/doc/libxcb1-dev/changelog.Debian.gz \
    ./usr/share/doc/libxcb1-dev/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
