PACKAGES = "${PN} libbsd0"
PROVIDES = "libbsd0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libb/libbsd/libbsd0_0.7.0-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libbsd0 = "libbsd0_0.7.0-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "4ced897d3c75be05ab794aaf7d3b3621dc65707840f3824beebec86bf2af9b57"
SRC_URI[deb0.md5sum] = "afc1eb98f916d4c091bf9c1b1de1c903"

RDEPENDS_${PN}0 = "libc6 (>= 2.8)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libbsd0 = " \
    ./lib/arm-linux-gnueabihf/libbsd.so.0 \
    ./lib/arm-linux-gnueabihf/libbsd.so.0.7.0 \
    ./usr/share/doc/libbsd0/changelog.Debian.gz \
    ./usr/share/doc/libbsd0/changelog.gz \
    ./usr/share/doc/libbsd0/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
