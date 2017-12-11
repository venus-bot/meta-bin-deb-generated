PACKAGES = "libncursesw5 libtinfo5"
PROVIDES = "libncursesw5 libtinfo5"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/n/ncurses/libncursesw5_5.9+20140913-1+deb8u2_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/n/ncurses/libtinfo5_5.9+20140913-1+deb8u2_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libncursesw5 = "libncursesw5_5.9+20140913-1+deb8u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "7ff791a5c2c88a23437f9adc1ce4abb290936c9fb02cd9604b06da6fd2bb625f"
SRC_URI[deb0.md5sum] = "e2b0bff76d0bc6068214a729c7ecd361"
DEBFILENAME_libtinfo5 = "libtinfo5_5.9+20140913-1+deb8u2_armhf.deb"
SRC_URI[deb1.sha256sum] = "eac5f480312f2a95383f88120f751a83beb8a0e598f318e15d79c4c9935055c1"
SRC_URI[deb1.md5sum] = "c26d1e8cd337a99b215e9793e89f3dc9"

RDEPENDS_lib${PN}w5 = "libtinfo5 (= 5.9+20140913-1+deb8u2) libc6 (>= 2.15)"
RDEPENDS_libtinfo5 = "libc6 (>= 2.15)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libncursesw5 = " \
	./usr/lib/arm-linux-gnueabihf/libpanelw.so.5 \
	./lib/arm-linux-gnueabihf/libncursesw.so.5.9 \
	./usr/lib/arm-linux-gnueabihf/libmenuw.so.5 \
	./usr/lib/arm-linux-gnueabihf/libpanelw.so.5.9 \
	./usr/lib/arm-linux-gnueabihf/libformw.so.5.9 \
	./usr/lib/arm-linux-gnueabihf/libformw.so.5 \
	./usr/share/doc/libncursesw5 \
	./usr/lib/arm-linux-gnueabihf/libmenuw.so.5.9 \
	./lib/arm-linux-gnueabihf/libncursesw.so.5\
"
FILES_libtinfo5 = " \
	./usr/lib/arm-linux-gnueabihf/libtic.so.5.9 \
	./lib/arm-linux-gnueabihf/libtinfo.so.5 \
	./lib/arm-linux-gnueabihf/libtinfo.so.5.9 \
	./usr/share/doc/libtinfo5/changelog.gz \
	./usr/share/doc/libtinfo5/copyright \
	./usr/lib/arm-linux-gnueabihf/libtic.so.5 \
	./usr/share/doc/libtinfo5/TODO.Debian \
	./usr/share/doc/libtinfo5/changelog.Debian.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
