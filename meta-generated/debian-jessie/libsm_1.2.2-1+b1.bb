PACKAGES = "${PN} libsm6"
PROVIDES = "libsm6"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libs/libsm/libsm6_1.2.2-1+b1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libsm6 = "libsm6_1.2.2-1+b1_armhf.deb"
SRC_URI[deb0.sha256sum] = "a53b8720d4eb870112ece24b602c4b9f52ed18f61bfa1921da12ad0e554c8608"
SRC_URI[deb0.md5sum] = "39b5ab9d2aa076e6e31efee46888659e"

RDEPENDS_${PN}6 = "libc6 (>= 2.4) libice6 (>= 1:1.0.0) libuuid1 (>= 2.16)"
DEPENDS = "libice6 libuuid1 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libsm6 = " \
    ./usr/lib/arm-linux-gnueabihf/libSM.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libSM.so.6.0.1 \
    ./usr/share/doc/libsm6/changelog.Debian.armhf.gz \
    ./usr/share/doc/libsm6/changelog.Debian.gz \
    ./usr/share/doc/libsm6/changelog.gz \
    ./usr/share/doc/libsm6/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
