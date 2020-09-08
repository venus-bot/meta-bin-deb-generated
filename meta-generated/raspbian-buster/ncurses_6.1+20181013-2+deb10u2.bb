PACKAGES = "${PN} libncursesw6 libtinfo6"
PROVIDES = "libncursesw6 libtinfo6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/n/ncurses/libncursesw6_6.1+20181013-2+deb10u2_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/n/ncurses/libtinfo6_6.1+20181013-2+deb10u2_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libncursesw6 = "libncursesw6_6.1+20181013-2+deb10u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "2435c3c7d6f27d907584a36583da629927eec4c2d8e2deff7bc8d814ff2b97b6"
SRC_URI[deb0.md5sum] = "d7294af49bfbd6993aff35bedad06164"
DEBFILENAME_libtinfo6 = "libtinfo6_6.1+20181013-2+deb10u2_armhf.deb"
SRC_URI[deb1.sha256sum] = "48f25a4a8c6629126aa77d9665030b83867f520e50cf8317249e22d8ec204963"
SRC_URI[deb1.md5sum] = "1cf9c22169e31dadde4c40c5a61b55d4"

RDEPENDS_lib${PN}w6 = "libc6 (>= 2.7) libtinfo6 (= 6.1+20181013-2+deb10u2)"
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
