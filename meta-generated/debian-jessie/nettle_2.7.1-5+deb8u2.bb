PACKAGES = "${PN} libhogweed2 libnettle4"
PROVIDES = "libhogweed2 libnettle4"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/n/nettle/libhogweed2_2.7.1-5+deb8u2_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/n/nettle/libnettle4_2.7.1-5+deb8u2_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libhogweed2 = "libhogweed2_2.7.1-5+deb8u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "66b11dce1d4b1b5ee973ea4e522e5ab2ca54d2bd58af77c0d7dad1acbafc5f0c"
SRC_URI[deb0.md5sum] = "47c6177125bc2433accccc57795964e1"
DEBFILENAME_libnettle4 = "libnettle4_2.7.1-5+deb8u2_armhf.deb"
SRC_URI[deb1.sha256sum] = "394afcc6840737bc2e1ca31bbd8a22033d4704b17a89d9ac36c2cc1ace287173"
SRC_URI[deb1.md5sum] = "524142851eaf1c3789689c36ff5e67f6"

RDEPENDS_libhogweed2 = "libc6 (>= 2.4) libgmp10 (>= 2:6.0.0) libnettle4 (= 2.7.1-5+deb8u2)"
RDEPENDS_lib${PN}4 = "libc6 (>= 2.4)"
DEPENDS = "libc6 libgmp10"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libhogweed2 = " \
    ./usr/lib/arm-linux-gnueabihf/libhogweed.so.2 \
    ./usr/lib/arm-linux-gnueabihf/libhogweed.so.2.5 \
    ./usr/share/doc/libhogweed2\
"
FILES_libnettle4 = " \
    ./usr/lib/arm-linux-gnueabihf/libnettle.so.4 \
    ./usr/lib/arm-linux-gnueabihf/libnettle.so.4.7 \
    ./usr/share/doc/libnettle4/NEWS.gz \
    ./usr/share/doc/libnettle4/README \
    ./usr/share/doc/libnettle4/changelog.Debian.gz \
    ./usr/share/doc/libnettle4/changelog.gz \
    ./usr/share/doc/libnettle4/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
