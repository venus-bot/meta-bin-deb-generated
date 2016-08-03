PACKAGES = "libhogweed2 libnettle4"
PROVIDES = "libhogweed2 libnettle4"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/n/nettle/libhogweed2_2.7.1-5+deb8u1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/n/nettle/libnettle4_2.7.1-5+deb8u1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libhogweed2 = "libhogweed2_2.7.1-5+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "8feb09f66335c96e43cbc724b1964864e726f90426e6c5d38b6de13ba297034b"
SRC_URI[deb0.md5sum] = "0282064bd14440d1b5a3218f07003a37"
DEBFILENAME_libnettle4 = "libnettle4_2.7.1-5+deb8u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "8b1d713572d996d9dcf68fb5fe632d47be0638d842512e35c4bcd7803ec07650"
SRC_URI[deb1.md5sum] = "9769cf5318aeba2f516274ffab290a49"

RDEPENDS_libhogweed2 = "libc6 (>= 2.4) libgmp10 (>= 2:6.0.0) libnettle4 (= 2.7.1-5+deb8u1)"
RDEPENDS_lib${PN}4 = "libc6 (>= 2.4)"
DEPENDS = "libgmp10 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libhogweed2 = " \
	./usr/lib/arm-linux-gnueabihf/libhogweed.so.2.5 \
	./usr/share/doc/libhogweed2 \
	./usr/lib/arm-linux-gnueabihf/libhogweed.so.2\
"
FILES_libnettle4 = " \
	./usr/share/doc/libnettle4/README \
	./usr/lib/arm-linux-gnueabihf/libnettle.so.4 \
	./usr/lib/arm-linux-gnueabihf/libnettle.so.4.7 \
	./usr/share/doc/libnettle4/changelog.Debian.gz \
	./usr/share/doc/libnettle4/NEWS.gz \
	./usr/share/doc/libnettle4/changelog.gz \
	./usr/share/doc/libnettle4/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
