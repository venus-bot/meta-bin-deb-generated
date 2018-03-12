PACKAGES = "${PN} libcap-ng0"
PROVIDES = "libcap-ng0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libc/libcap-ng/libcap-ng0_0.7.4-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libcap-ng0 = "libcap-ng0_0.7.4-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "cf49001a161521692c7258f478233d18779aeaa8208932f920e35cd1af780ab8"
SRC_URI[deb0.md5sum] = "57fe6dbc1671b79dbb6be8fa147353fb"

RDEPENDS_${PN}0 = "libc6 (>= 2.8)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libcap-ng0 = " \
    ./usr/lib/arm-linux-gnueabihf/libcap-ng.so.0.0.0 \
    ./usr/share/doc/libcap-ng0/changelog.gz \
    ./usr/lib/arm-linux-gnueabihf/libcap-ng.so.0 \
    ./usr/share/doc/libcap-ng0/changelog.Debian.gz \
    ./usr/share/doc/libcap-ng0/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
