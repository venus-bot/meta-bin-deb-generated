PACKAGES = "${PN} libmpdec2"
PROVIDES = "libmpdec2"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/m/mpdecimal/libmpdec2_2.4.2-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libmpdec2 = "libmpdec2_2.4.2-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "6e02dd1398652b5d49defa6e2e05bd209d47ca08ff7c2d5801afe044f2a7792f"
SRC_URI[deb0.md5sum] = "fa116a050c010c2f79dab80e512459ab"

RDEPENDS_libmpdec2 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

FILES_libmpdec2 = " \
    ./usr/lib/arm-linux-gnueabihf/libmpdec.so.2 \
    ./usr/lib/arm-linux-gnueabihf/libmpdec.so.2.4.2 \
    ./usr/share/doc/libmpdec2/changelog.Debian.gz \
    ./usr/share/doc/libmpdec2/changelog.gz \
    ./usr/share/doc/libmpdec2/copyright\
"
