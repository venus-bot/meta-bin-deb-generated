PACKAGES = "${PN} libuv1"
PROVIDES = "libuv1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libu/libuv1/libuv1_1.24.1-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libuv1 = "libuv1_1.24.1-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "8421f1540c6b96b28dbcb967def233839879e6e3c23613d62227293d59b0b1ed"
SRC_URI[deb0.md5sum] = "f8ab823495449fcd7b1131b322310a1f"

RDEPENDS_${PN} = "libc6 (>= 2.28)"
DEPENDS = "libc6"


inherit deb_group

FILES_${PN} = " \
    ./usr/lib/arm-linux-gnueabihf/libuv.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libuv.so.1.0.0 \
    ./usr/share/doc/libuv1/changelog.Debian.gz \
    ./usr/share/doc/libuv1/changelog.gz \
    ./usr/share/doc/libuv1/copyright\
"
