PACKAGES = "${PN} libncurses5 libncursesw5 libtinfo5"
PROVIDES = "libncurses5 libncursesw5 libtinfo5"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/n/ncurses/libncurses5_5.9+20140913-1+deb8u3_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/n/ncurses/libncursesw5_5.9+20140913-1+deb8u3_armhf.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/n/ncurses/libtinfo5_5.9+20140913-1+deb8u3_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_libncurses5 = "libncurses5_5.9+20140913-1+deb8u3_armhf.deb"
SRC_URI[deb0.sha256sum] = "7f02fddc0fda2d71b598b3077a2dd0d856ad74e04e559e3e0f7ba1ff4b412a7c"
SRC_URI[deb0.md5sum] = "9debb3b7935f290219de86dcf4849405"
DEBFILENAME_libncursesw5 = "libncursesw5_5.9+20140913-1+deb8u3_armhf.deb"
SRC_URI[deb1.sha256sum] = "ff4c69d5360a650f7c3c340539681decd92657ace115aaca4de49a060a53bacd"
SRC_URI[deb1.md5sum] = "b93eaee36d9c0ab06593d575c9027976"
DEBFILENAME_libtinfo5 = "libtinfo5_5.9+20140913-1+deb8u3_armhf.deb"
SRC_URI[deb2.sha256sum] = "f6707c065096d68afe74c02a8a3917a0140cdf6ff31dfecc76c6dc8bf3c56efe"
SRC_URI[deb2.md5sum] = "b66824f0db03b005492cbbe98c944ed4"

RDEPENDS_lib${PN}5 = "libc6 (>= 2.15) libtinfo5 (= 5.9+20140913-1+deb8u3) libtinfo5 (>= 5.9-3) multiarch-support"
RDEPENDS_lib${PN}w5 = "libc6 (>= 2.15) libtinfo5 (= 5.9+20140913-1+deb8u3) multiarch-support"
RDEPENDS_libtinfo5 = "libc6 (>= 2.15) multiarch-support"
DEPENDS = "libc6 multiarch-support"


inherit deb_group

FILES_libncurses5 = " \
    ./lib/arm-linux-gnueabihf/libncurses.so.5 \
    ./lib/arm-linux-gnueabihf/libncurses.so.5.9 \
    ./usr/lib/arm-linux-gnueabihf/libform.so.5 \
    ./usr/lib/arm-linux-gnueabihf/libform.so.5.9 \
    ./usr/lib/arm-linux-gnueabihf/libmenu.so.5 \
    ./usr/lib/arm-linux-gnueabihf/libmenu.so.5.9 \
    ./usr/lib/arm-linux-gnueabihf/libpanel.so.5 \
    ./usr/lib/arm-linux-gnueabihf/libpanel.so.5.9 \
    ./usr/share/doc/libncurses5\
"
FILES_libncursesw5 = " \
    ./lib/arm-linux-gnueabihf/libncursesw.so.5 \
    ./lib/arm-linux-gnueabihf/libncursesw.so.5.9 \
    ./usr/lib/arm-linux-gnueabihf/libformw.so.5 \
    ./usr/lib/arm-linux-gnueabihf/libformw.so.5.9 \
    ./usr/lib/arm-linux-gnueabihf/libmenuw.so.5 \
    ./usr/lib/arm-linux-gnueabihf/libmenuw.so.5.9 \
    ./usr/lib/arm-linux-gnueabihf/libpanelw.so.5 \
    ./usr/lib/arm-linux-gnueabihf/libpanelw.so.5.9 \
    ./usr/share/doc/libncursesw5\
"
FILES_libtinfo5 = " \
    ./lib/arm-linux-gnueabihf/libtinfo.so.5 \
    ./lib/arm-linux-gnueabihf/libtinfo.so.5.9 \
    ./usr/lib/arm-linux-gnueabihf/libtic.so.5 \
    ./usr/lib/arm-linux-gnueabihf/libtic.so.5.9 \
    ./usr/share/doc/libtinfo5/TODO.Debian \
    ./usr/share/doc/libtinfo5/changelog.Debian.gz \
    ./usr/share/doc/libtinfo5/changelog.gz \
    ./usr/share/doc/libtinfo5/copyright\
"
