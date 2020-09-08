PACKAGES = "${PN} libncursesw6 libtinfo6"
PROVIDES = "libncursesw6 libtinfo6"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/n/ncurses/libncursesw6_6.1+20181013-2+deb10u2_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/n/ncurses/libtinfo6_6.1+20181013-2+deb10u2_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libncursesw6 = "libncursesw6_6.1+20181013-2+deb10u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "984cd005ad6edf2792f383973d4f8d9bb3aae81ebd35287b62806faf37bf222a"
SRC_URI[deb0.md5sum] = "ef1f8ce9cade7b5fa9f19b879907e120"
DEBFILENAME_libtinfo6 = "libtinfo6_6.1+20181013-2+deb10u2_armhf.deb"
SRC_URI[deb1.sha256sum] = "5bb6e9c2dab2309dcd0f0d9d9990f21404032c1082a9bd2b127e13e085592f72"
SRC_URI[deb1.md5sum] = "75583a5ee3231fbacffe281bcfa4c2f1"

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
