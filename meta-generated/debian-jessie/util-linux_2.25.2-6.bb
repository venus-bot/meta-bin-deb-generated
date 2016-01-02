PACKAGES = "libuuid1"
PROVIDES = "libuuid1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/u/util-linux/libuuid1_2.25.2-6_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libuuid1 = "libuuid1_2.25.2-6_armhf.deb"
SRC_URI[deb0.sha256sum] = "3b21bafc7aee628a716eb01746a62b722a86df202d75b4dd1ef540bfb45c1ac6"
SRC_URI[deb0.md5sum] = "886e4adaa3fafee55d0a8f2fb85079f4"

RDEPENDS_libuuid1 = "passwd libc6 (>= 2.4)"
DEPENDS = "passwd libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libuuid1 = " \
	./usr/share/doc/libuuid1/copyright \
	./lib/arm-linux-gnueabihf/libuuid.so.1.3.0 \
	./usr/share/doc/libuuid1/changelog.Debian.gz \
	./lib/arm-linux-gnueabihf/libuuid.so.1 \
	./usr/share/doc/libuuid1/changelog.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
