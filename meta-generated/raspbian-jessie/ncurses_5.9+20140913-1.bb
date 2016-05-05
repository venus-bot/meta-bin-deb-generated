PACKAGES = "libncursesw5 libtinfo5"
PROVIDES = "libncursesw5 libtinfo5"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/n/ncurses/libncursesw5_5.9+20140913-1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/n/ncurses/libtinfo5_5.9+20140913-1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libncursesw5 = "libncursesw5_5.9+20140913-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "f41b7c0e1807cef7648c866fa0dc7ddfe87a1c2647f7c4de498909a04c97837b"
SRC_URI[deb0.md5sum] = "22f74031c19a8304077c8ae274e7b62f"
DEBFILENAME_libtinfo5 = "libtinfo5_5.9+20140913-1_armhf.deb"
SRC_URI[deb1.sha256sum] = "7a29ed6f7cf83a7e27cd298938541ea0d637249b0564e0800cd8779bd7ca88df"
SRC_URI[deb1.md5sum] = "d042c61d30964ae86d00c6b7db8034c4"

RDEPENDS_lib${PN}w5 = "libtinfo5 (= 5.9+20140913-1) libc6 (>= 2.15)"
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
