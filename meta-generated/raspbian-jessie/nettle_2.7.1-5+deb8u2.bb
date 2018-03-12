PACKAGES = "${PN} libhogweed2 libnettle4"
PROVIDES = "libhogweed2 libnettle4"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/n/nettle/libhogweed2_2.7.1-5+deb8u2_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/n/nettle/libnettle4_2.7.1-5+deb8u2_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libhogweed2 = "libhogweed2_2.7.1-5+deb8u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "07c1aec6fcfd2279c3cfda0cf2de9c4136f3538230d98068a52b5d7bb731b5e7"
SRC_URI[deb0.md5sum] = "eefe0f4771fa0b1c361713f69cd02a0a"
DEBFILENAME_libnettle4 = "libnettle4_2.7.1-5+deb8u2_armhf.deb"
SRC_URI[deb1.sha256sum] = "d02455d8a4bd090aa8352ca8da320e6628d2e44565bdd1ce0f52f9efad3ac6ab"
SRC_URI[deb1.md5sum] = "483004cc146b48dcf5dd09d457be735c"

RDEPENDS_libhogweed2 = "libc6 (>= 2.4) libgmp10 (>= 2:6.0.0) libnettle4 (= 2.7.1-5+deb8u2)"
RDEPENDS_lib${PN}4 = "libc6 (>= 2.4)"
DEPENDS = "libc6 libgmp10"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libhogweed2 = " \
    ./usr/share/doc/libhogweed2 \
    ./usr/lib/arm-linux-gnueabihf/libhogweed.so.2 \
    ./usr/lib/arm-linux-gnueabihf/libhogweed.so.2.5\
"
FILES_libnettle4 = " \
    ./usr/share/doc/libnettle4/NEWS.gz \
    ./usr/share/doc/libnettle4/changelog.gz \
    ./usr/lib/arm-linux-gnueabihf/libnettle.so.4 \
    ./usr/share/doc/libnettle4/README \
    ./usr/lib/arm-linux-gnueabihf/libnettle.so.4.7 \
    ./usr/share/doc/libnettle4/changelog.Debian.gz \
    ./usr/share/doc/libnettle4/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
