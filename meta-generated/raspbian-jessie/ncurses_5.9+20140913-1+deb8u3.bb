PACKAGES = "${PN} libncurses5 libncursesw5 libtinfo5"
PROVIDES = "libncurses5 libncursesw5 libtinfo5"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/n/ncurses/libncurses5_5.9+20140913-1+deb8u3_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/n/ncurses/libncursesw5_5.9+20140913-1+deb8u3_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/n/ncurses/libtinfo5_5.9+20140913-1+deb8u3_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_libncurses5 = "libncurses5_5.9+20140913-1+deb8u3_armhf.deb"
SRC_URI[deb0.sha256sum] = "e1ab8bb0f7b0241cdca353a826744a6a96e48361759e821f157797adb12a60e9"
SRC_URI[deb0.md5sum] = "ba1e8a5d49d71c6e566be6a26841d5d0"
DEBFILENAME_libncursesw5 = "libncursesw5_5.9+20140913-1+deb8u3_armhf.deb"
SRC_URI[deb1.sha256sum] = "45764ea272823c48b58ff6d6ba1662b48d7c758ddb9add1c174d18fece243601"
SRC_URI[deb1.md5sum] = "c3325e3e5bc4c7f84feb9500d4c6a8d1"
DEBFILENAME_libtinfo5 = "libtinfo5_5.9+20140913-1+deb8u3_armhf.deb"
SRC_URI[deb2.sha256sum] = "995a104c4edc84a0fa7a362fbbd6be50e9433b06d04df1303c7dfc3babb85e24"
SRC_URI[deb2.md5sum] = "f4f1416df0e96273185906051cb98558"

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
