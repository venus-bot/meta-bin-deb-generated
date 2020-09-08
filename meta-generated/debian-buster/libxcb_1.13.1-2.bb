PACKAGES = "${PN} libxcb-render0 libxcb-shm0 libxcb1 libxcb1-dev"
PROVIDES = "libxcb-render0 libxcb-shm0 libxcb1 libxcb1-dev"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libx/libxcb/libxcb-render0_1.13.1-2_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/libx/libxcb/libxcb-shm0_1.13.1-2_armhf.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/libx/libxcb/libxcb1_1.13.1-2_armhf.deb;unpack=0;name=deb2\
	http://ftp.de.debian.org/debian/pool/main/libx/libxcb/libxcb1-dev_1.13.1-2_armhf.deb;unpack=0;name=deb3\
"
DEBFILENAME_libxcb-render0 = "libxcb-render0_1.13.1-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "5929bd439e0c07e4bea60d0db96ac42fca4c56a1a4ccaabaa7b9a1453d2d345f"
SRC_URI[deb0.md5sum] = "a4e7c5928bca6839672f8dfb0bb9a0cd"
DEBFILENAME_libxcb-shm0 = "libxcb-shm0_1.13.1-2_armhf.deb"
SRC_URI[deb1.sha256sum] = "3fe531fb8a57718c32c95d32146506711a6ada413e4ab63b3dfc01fbd788b4cc"
SRC_URI[deb1.md5sum] = "709057ba4ec73c972c9bbb3e8c6bb044"
DEBFILENAME_libxcb1 = "libxcb1_1.13.1-2_armhf.deb"
SRC_URI[deb2.sha256sum] = "5d6a4c76a686be2d536b600ff5ea79556b58e287e15cf3d672d97a1ee8f132d5"
SRC_URI[deb2.md5sum] = "be7f8649c92110dd768698e7e60f46fb"
DEBFILENAME_libxcb1-dev = "libxcb1-dev_1.13.1-2_armhf.deb"
SRC_URI[deb3.sha256sum] = "15378123f4656683c76d2bb448aef90adba939e64b683143daa8eef6ca821773"
SRC_URI[deb3.md5sum] = "6a23af1fe5c4f9c1d95fd2b88a357156"

RDEPENDS_${PN}-render0 = "libc6 (>= 2.4) libxcb1 (>= 1.8)"
RDEPENDS_${PN}-shm0 = "libc6 (>= 2.4) libxcb1 (>= 1.12)"
RDEPENDS_${PN}1 = "libc6 (>= 2.28) libxau6 libxdmcp6"
RDEPENDS_${PN}1-dev = "libpthread-stubs0-dev libxau-dev (>= 1:1.0.0-1) libxcb1 (= 1.13.1-2) libxdmcp-dev (>= 1:1.0.0-1)"
DEPENDS = "libc6 libpthread-stubs0-dev libxau-dev libxau6 libxdmcp-dev libxdmcp6"


inherit deb_group

FILES_libxcb-render0 = " \
    ./usr/lib/arm-linux-gnueabihf/libxcb-render.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libxcb-render.so.0.0.0 \
    ./usr/share/doc/libxcb-render0/changelog.Debian.gz \
    ./usr/share/doc/libxcb-render0/changelog.gz \
    ./usr/share/doc/libxcb-render0/copyright\
"
FILES_libxcb-shm0 = " \
    ./usr/lib/arm-linux-gnueabihf/libxcb-shm.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libxcb-shm.so.0.0.0 \
    ./usr/share/doc/libxcb-shm0/changelog.Debian.gz \
    ./usr/share/doc/libxcb-shm0/changelog.gz \
    ./usr/share/doc/libxcb-shm0/copyright\
"
FILES_libxcb1 = " \
    ./usr/lib/arm-linux-gnueabihf/libxcb.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libxcb.so.1.1.0 \
    ./usr/share/doc/libxcb1/changelog.Debian.gz \
    ./usr/share/doc/libxcb1/changelog.gz \
    ./usr/share/doc/libxcb1/copyright\
"
FILES_libxcb1-dev = " \
    ./usr/include/xcb/bigreq.h \
    ./usr/include/xcb/xc_misc.h \
    ./usr/include/xcb/xcb.h \
    ./usr/include/xcb/xcbext.h \
    ./usr/include/xcb/xproto.h \
    ./usr/lib/arm-linux-gnueabihf/libxcb.a \
    ./usr/lib/arm-linux-gnueabihf/libxcb.so \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/xcb.pc \
    ./usr/share/doc/libxcb1-dev/changelog.Debian.gz \
    ./usr/share/doc/libxcb1-dev/changelog.gz \
    ./usr/share/doc/libxcb1-dev/copyright\
"
