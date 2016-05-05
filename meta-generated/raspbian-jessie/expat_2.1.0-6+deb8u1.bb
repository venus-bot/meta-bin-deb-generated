PACKAGES = "libexpat1"
PROVIDES = "libexpat1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/e/expat/libexpat1_2.1.0-6+deb8u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libexpat1 = "libexpat1_2.1.0-6+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "80df90ec08c9c272fd39cfb28d7f34e60d09a17b8587150d3eaa61391aee22ba"
SRC_URI[deb0.md5sum] = "074573476eda6cd298fc39d7d6482365"

RDEPENDS_lib${PN}1 = "libc6 (>= 2.4) libgcc1 (>= 1:4.4.0)"
DEPENDS = "libgcc1 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libexpat1 = " \
	./usr/lib/arm-linux-gnueabihf/libexpatw.so.1 \
	./lib/arm-linux-gnueabihf/libexpat.so.1.6.0 \
	./usr/share/doc/libexpat1/changelog.gz \
	./usr/share/doc/libexpat1/copyright \
	./usr/share/doc/libexpat1/changelog.Debian.gz \
	./lib/arm-linux-gnueabihf/libexpat.so.1 \
	./usr/lib/arm-linux-gnueabihf/libexpatw.so.1.6.0\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
