PACKAGES = "${PN} libxrender1"
PROVIDES = "libxrender1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxrender/libxrender1_0.9.8-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libxrender1 = "libxrender1_0.9.8-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "d15e815667fbaa7e7a6e86202da03e73bc7c6bf20eb8c9f9f9a0b24349134778"
SRC_URI[deb0.md5sum] = "d17cab31770ae2c4d8357fbc0663f7b4"

RDEPENDS_${PN}1 = "libc6 (>= 2.4) libx11-6 (>= 2:1.6.0)"
DEPENDS = "libx11-6 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libxrender1 = " \
    ./usr/lib/arm-linux-gnueabihf/libXrender.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libXrender.so.1.3.0 \
    ./usr/share/doc/libxrender1/changelog.Debian.gz \
    ./usr/share/doc/libxrender1/changelog.gz \
    ./usr/share/doc/libxrender1/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
