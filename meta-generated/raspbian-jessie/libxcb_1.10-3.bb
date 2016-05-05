PACKAGES = "libxcb1 libxcb1-dev"
PROVIDES = "libxcb1 libxcb1-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxcb/libxcb1_1.10-3_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/libx/libxcb/libxcb1-dev_1.10-3_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libxcb1 = "libxcb1_1.10-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "382078e38fe65bccd47438fd95729a095af132e8e5a1f2c4408914d54dcc7658"
SRC_URI[deb0.md5sum] = "c9a08426f3fdc3e28912228793aa7a8b"
DEBFILENAME_libxcb1-dev = "libxcb1-dev_1.10-3_armhf.deb"
SRC_URI[deb1.sha256sum] = "9708671be94e8a1565a99c4ca375623571d6ca5c62e480a928919ebc00b8557b"
SRC_URI[deb1.md5sum] = "bc3bbbd78897f528764d23bf49fa13ff"

RDEPENDS_${PN}1 = "libc6 (>= 2.4) libxau6 libxdmcp6"
RDEPENDS_${PN}1-dev = "libxcb1 (= 1.10-3) libpthread-stubs0-dev libxau-dev (>= 1:1.0.0-1) libxdmcp-dev (>= 1:1.0.0-1)"
DEPENDS = "libxau-dev libxdmcp6 libc6 libxau6 libpthread-stubs0-dev libxdmcp-dev"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libxcb1 = " \
	./usr/share/doc/libxcb1/copyright \
	./usr/share/doc/libxcb1/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/libxcb.so.1.1.0 \
	./usr/lib/arm-linux-gnueabihf/libxcb.so.1\
"
FILES_libxcb1-dev = " \
	./usr/share/doc/libxcb1-dev/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/xcb.pc \
	./usr/lib/arm-linux-gnueabihf/libxcb.so \
	./usr/include/xcb/xproto.h \
	./usr/share/doc/libxcb1-dev/copyright \
	./usr/include/xcb/xc_misc.h \
	./usr/include/xcb/xcbext.h \
	./usr/include/xcb/xcb.h \
	./usr/lib/arm-linux-gnueabihf/libxcb.a \
	./usr/include/xcb/bigreq.h\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
