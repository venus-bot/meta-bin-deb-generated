PACKAGES = "${PN} libsm6"
PROVIDES = "libsm6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libs/libsm/libsm6_1.2.2-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libsm6 = "libsm6_1.2.2-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "7df0a3990380f85d2109f639e8e17be52a90a6c7c077ee2553e3fdb2ae814c7d"
SRC_URI[deb0.md5sum] = "eee010ece42e4a75a33d172824e124e7"

RDEPENDS_${PN}6 = "libc6 (>= 2.4) libice6 (>= 1:1.0.0) libuuid1 (>= 2.16)"
DEPENDS = "libc6 libuuid1 libice6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libsm6 = " \
    ./usr/lib/arm-linux-gnueabihf/libSM.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libSM.so.6.0.1 \
    ./usr/share/doc/libsm6/changelog.Debian.gz \
    ./usr/share/doc/libsm6/changelog.gz \
    ./usr/share/doc/libsm6/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
