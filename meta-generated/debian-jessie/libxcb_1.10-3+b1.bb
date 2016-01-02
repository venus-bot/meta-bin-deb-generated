PACKAGES = "libxcb1 libxcb1-dev"
PROVIDES = "libxcb1 libxcb1-dev"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libx/libxcb/libxcb1_1.10-3+b1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/libx/libxcb/libxcb1-dev_1.10-3+b1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libxcb1 = "libxcb1_1.10-3+b1_armhf.deb"
SRC_URI[deb0.sha256sum] = "6f5c3a6e93329e4786b12be4d055f20ebaa5a2c0a90aabee070a1fbe3825fe67"
SRC_URI[deb0.md5sum] = "a0f783bfbf449d5e658bea0c73fd75b6"
DEBFILENAME_libxcb1-dev = "libxcb1-dev_1.10-3+b1_armhf.deb"
SRC_URI[deb1.sha256sum] = "6cef447558a3921f46f2a85ece415d2d3aa4fdb17f0377922649fec0914c8068"
SRC_URI[deb1.md5sum] = "dfeb673e04baedaf449cdea1f2a16865"

RDEPENDS_${PN}1 = "libc6 (>= 2.4) libxau6 libxdmcp6"
RDEPENDS_${PN}1-dev = "libxcb1 (= 1.10-3+b1) libpthread-stubs0-dev libxau-dev (>= 1:1.0.0-1) libxdmcp-dev (>= 1:1.0.0-1)"
DEPENDS = "libxau-dev libxdmcp6 libc6 libxau6 libpthread-stubs0-dev libxdmcp-dev"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libxcb1 = " \
	./usr/share/doc/libxcb1/changelog.Debian.gz \
	./usr/share/doc/libxcb1/changelog.Debian.armhf.gz \
	./usr/lib/arm-linux-gnueabihf/libxcb.so.1.1.0 \
	./usr/lib/arm-linux-gnueabihf/libxcb.so.1 \
	./usr/share/doc/libxcb1/copyright\
"
FILES_libxcb1-dev = " \
	./usr/share/doc/libxcb1-dev/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/xcb.pc \
	./usr/lib/arm-linux-gnueabihf/libxcb.so \
	./usr/share/doc/libxcb1-dev/changelog.Debian.armhf.gz \
	./usr/include/xcb/xproto.h \
	./usr/share/doc/libxcb1-dev/copyright \
	./usr/include/xcb/xc_misc.h \
	./usr/include/xcb/xcb.h \
	./usr/include/xcb/xcbext.h \
	./usr/include/xcb/bigreq.h \
	./usr/lib/arm-linux-gnueabihf/libxcb.a\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
