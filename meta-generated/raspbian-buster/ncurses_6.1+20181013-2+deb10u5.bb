PACKAGES = "${PN} libncursesw6 libtinfo6"
PROVIDES = "libncursesw6 libtinfo6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/n/ncurses/libncursesw6_6.1+20181013-2+deb10u5_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/n/ncurses/libtinfo6_6.1+20181013-2+deb10u5_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libncursesw6 = "libncursesw6_6.1+20181013-2+deb10u5_armhf.deb"
SRC_URI[deb0.sha256sum] = "80f7831aa8a9043508feb563a6a5185bbc2440b4f6a56f991adfdbb2e974d812"
SRC_URI[deb0.md5sum] = "56b6bbe632042ff501397b6d2d75f65a"
DEBFILENAME_libtinfo6 = "libtinfo6_6.1+20181013-2+deb10u5_armhf.deb"
SRC_URI[deb1.sha256sum] = "daad46deaf8bac926a874401b3642c9c3cc0fbf78cf9a44f0d0addd24c8ed8eb"
SRC_URI[deb1.md5sum] = "40c7094f6be482be9b8edbe907bca327"

RDEPENDS_lib${PN}w6 = "libc6 (>= 2.7) libtinfo6 (= 6.1+20181013-2+deb10u5)"
RDEPENDS_libtinfo6 = "libc6 (>= 2.16)"
DEPENDS = "libc6"


inherit deb_group

FILES_libncursesw6 = " \
    ./lib/arm-linux-gnueabihf/libncursesw.so.6 \
    ./lib/arm-linux-gnueabihf/libncursesw.so.6.1 \
    ./usr/lib/arm-linux-gnueabihf/libformw.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libformw.so.6.1 \
    ./usr/lib/arm-linux-gnueabihf/libmenuw.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libmenuw.so.6.1 \
    ./usr/lib/arm-linux-gnueabihf/libpanelw.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libpanelw.so.6.1 \
    ./usr/share/doc/libncursesw6\
"
FILES_libtinfo6 = " \
    ./lib/arm-linux-gnueabihf/libtinfo.so.6 \
    ./lib/arm-linux-gnueabihf/libtinfo.so.6.1 \
    ./usr/lib/arm-linux-gnueabihf/libtic.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libtic.so.6.1 \
    ./usr/share/doc/libtinfo6/FAQ \
    ./usr/share/doc/libtinfo6/TODO.Debian \
    ./usr/share/doc/libtinfo6/changelog.Debian.gz \
    ./usr/share/doc/libtinfo6/changelog.gz \
    ./usr/share/doc/libtinfo6/copyright\
"
