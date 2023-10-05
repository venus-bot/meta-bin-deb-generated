PACKAGES = "${PN} libncursesw6 libtinfo6"
PROVIDES = "libncursesw6 libtinfo6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/n/ncurses/libncursesw6_6.1+20181013-2+deb10u4_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/n/ncurses/libtinfo6_6.1+20181013-2+deb10u4_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libncursesw6 = "libncursesw6_6.1+20181013-2+deb10u4_armhf.deb"
SRC_URI[deb0.sha256sum] = "d561e97a8cdcad63edd843d900783649b29488d82f6afa9a4c2c0b5120a0e089"
SRC_URI[deb0.md5sum] = "623a8e09a5b002fd36ab255982761889"
DEBFILENAME_libtinfo6 = "libtinfo6_6.1+20181013-2+deb10u4_armhf.deb"
SRC_URI[deb1.sha256sum] = "a037d2edc0661b1c4c61560f6620e8fe287ea8e50d4ad993eac1b4d71b0ef60a"
SRC_URI[deb1.md5sum] = "ca729117c3d59e643fade8c7f31d8448"

RDEPENDS_lib${PN}w6 = "libc6 (>= 2.7) libtinfo6 (= 6.1+20181013-2+deb10u4)"
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
