PACKAGES = "${PN} libice6"
PROVIDES = "libice6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libi/libice/libice6_1.0.9-1+deb8u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libice6 = "libice6_1.0.9-1+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "2969b6f99ce399f087c4ebdb3c720f918a336bde6327c6f03320ef7cb2812f22"
SRC_URI[deb0.md5sum] = "a34a884198f608f298d27630cd678aab"

RDEPENDS_${PN}6 = "libbsd0 (>= 0.2.0) libc6 (>= 2.11) x11-common"
DEPENDS = "libbsd0 libc6 x11-common"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libice6 = " \
    ./usr/lib/arm-linux-gnueabihf/libICE.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libICE.so.6.3.0 \
    ./usr/share/doc/libice6/changelog.Debian.gz \
    ./usr/share/doc/libice6/changelog.gz \
    ./usr/share/doc/libice6/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"