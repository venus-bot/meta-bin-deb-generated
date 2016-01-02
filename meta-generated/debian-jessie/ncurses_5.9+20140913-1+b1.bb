PACKAGES = "libncursesw5 libtinfo5"
PROVIDES = "libncursesw5 libtinfo5"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/n/ncurses/libncursesw5_5.9+20140913-1+b1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/n/ncurses/libtinfo5_5.9+20140913-1+b1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libncursesw5 = "libncursesw5_5.9+20140913-1+b1_armhf.deb"
SRC_URI[deb0.sha256sum] = "6e13cb40f85115ea24c6682b3cbb42e15db12b8eb959eba676d2431007a26514"
SRC_URI[deb0.md5sum] = "16eff2bdad5d19359d1f18ff082ef379"
DEBFILENAME_libtinfo5 = "libtinfo5_5.9+20140913-1+b1_armhf.deb"
SRC_URI[deb1.sha256sum] = "be6e780d7107d209a78b4808c5e8c5875110ba4a2aa868c832485dece0101eda"
SRC_URI[deb1.md5sum] = "4233ea59563d395ed187806e49b0d0c2"

RDEPENDS_lib${PN}w5 = "libtinfo5 (= 5.9+20140913-1+b1) libc6 (>= 2.15)"
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
	./usr/share/doc/libtinfo5/changelog.Debian.armhf.gz \
	./usr/share/doc/libtinfo5/TODO.Debian \
	./usr/lib/arm-linux-gnueabihf/libtic.so.5 \
	./usr/share/doc/libtinfo5/copyright \
	./usr/share/doc/libtinfo5/changelog.Debian.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
