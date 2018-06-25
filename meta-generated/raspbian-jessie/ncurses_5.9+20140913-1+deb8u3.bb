PACKAGES = "${PN} libncursesw5 libtinfo5"
PROVIDES = "libncursesw5 libtinfo5"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/n/ncurses/libncursesw5_5.9+20140913-1+deb8u3_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/n/ncurses/libtinfo5_5.9+20140913-1+deb8u3_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libncursesw5 = "libncursesw5_5.9+20140913-1+deb8u3_armhf.deb"
SRC_URI[deb0.sha256sum] = "45764ea272823c48b58ff6d6ba1662b48d7c758ddb9add1c174d18fece243601"
SRC_URI[deb0.md5sum] = "c3325e3e5bc4c7f84feb9500d4c6a8d1"
DEBFILENAME_libtinfo5 = "libtinfo5_5.9+20140913-1+deb8u3_armhf.deb"
SRC_URI[deb1.sha256sum] = "995a104c4edc84a0fa7a362fbbd6be50e9433b06d04df1303c7dfc3babb85e24"
SRC_URI[deb1.md5sum] = "f4f1416df0e96273185906051cb98558"

RDEPENDS_lib${PN}w5 = "libc6 (>= 2.15) libtinfo5 (= 5.9+20140913-1+deb8u3)"
RDEPENDS_libtinfo5 = "libc6 (>= 2.15)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

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
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
