PACKAGES = "libhogweed2 libnettle4"
PROVIDES = "libhogweed2 libnettle4"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/n/nettle/libhogweed2_2.7.1-5+deb8u1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/n/nettle/libnettle4_2.7.1-5+deb8u1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libhogweed2 = "libhogweed2_2.7.1-5+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "50d07211f37b456387d011c669b1b0a84bfa0ddc8224960abb759d8de2ffd97d"
SRC_URI[deb0.md5sum] = "2ee930a373466052f8eae958b8cc66a9"
DEBFILENAME_libnettle4 = "libnettle4_2.7.1-5+deb8u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "cdb2ad79d106cd8839cf51fe2cad00d5665facc53d8ff7753bbc3d92354b1710"
SRC_URI[deb1.md5sum] = "b1a38579c55abe82f52fa6a3c0a3f8e8"

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
