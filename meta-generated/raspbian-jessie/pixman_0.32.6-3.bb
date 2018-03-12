PACKAGES = "${PN} libpixman-1-0"
PROVIDES = "libpixman-1-0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/pixman/libpixman-1-0_0.32.6-3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libpixman-1-0 = "libpixman-1-0_0.32.6-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "cc9af8d7f15296ae7b534e84b52194c3b5ccddf59d47a9862fefc3c2e0323287"
SRC_URI[deb0.md5sum] = "c60d57558aa8b5595a38a3d94a13285c"

RDEPENDS_lib${PN}-1-0 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libpixman-1-0 = " \
    ./usr/lib/arm-linux-gnueabihf/libpixman-1.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libpixman-1.so.0.32.6 \
    ./usr/share/doc/libpixman-1-0/changelog.Debian.gz \
    ./usr/share/doc/libpixman-1-0/changelog.gz \
    ./usr/share/doc/libpixman-1-0/copyright \
    ./usr/share/lintian/overrides/libpixman-1-0\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
