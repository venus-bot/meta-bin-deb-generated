PACKAGES = "${PN} libsepol1"
PROVIDES = "libsepol1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libs/libsepol/libsepol1_2.3-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libsepol1 = "libsepol1_2.3-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "bbcf916881510068ad6937ee1d52fd6419e868ec9c4c5d2490c6158cbccb0bb4"
SRC_URI[deb0.md5sum] = "265476e42cdde2cb87edbfc2dab665ce"

RDEPENDS_${PN}1 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libsepol1 = " \
    ./usr/share/doc/libsepol1/copyright \
    ./usr/share/doc/libsepol1/changelog.Debian.gz \
    ./lib/arm-linux-gnueabihf/libsepol.so.1 \
    ./usr/share/doc/libsepol1/changelog.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
