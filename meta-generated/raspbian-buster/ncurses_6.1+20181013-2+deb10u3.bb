PACKAGES = "${PN} libncursesw6 libtinfo6"
PROVIDES = "libncursesw6 libtinfo6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/n/ncurses/libncursesw6_6.1+20181013-2+deb10u3_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/n/ncurses/libtinfo6_6.1+20181013-2+deb10u3_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libncursesw6 = "libncursesw6_6.1+20181013-2+deb10u3_armhf.deb"
SRC_URI[deb0.sha256sum] = "dc37f008bc0ad032af728b45c30a826c390055aae2b20950e3a368cca36b9a3e"
SRC_URI[deb0.md5sum] = "b1532eb60231ee31879a94ed01e298c8"
DEBFILENAME_libtinfo6 = "libtinfo6_6.1+20181013-2+deb10u3_armhf.deb"
SRC_URI[deb1.sha256sum] = "17e258020515d132640b8dd812afd0cbf1fd68a34b149e34704545f41a552fa8"
SRC_URI[deb1.md5sum] = "446ca5a6ebd32f451419d9bda9296edf"

RDEPENDS_lib${PN}w6 = "libc6 (>= 2.7) libtinfo6 (= 6.1+20181013-2+deb10u3)"
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
