PACKAGES = "${PN} libuv1"
PROVIDES = "libuv1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libu/libuv1/libuv1_1.24.1-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libuv1 = "libuv1_1.24.1-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "fa8fb939627665ebdace965c2220520e0f11f5e3ea72d8a3d2e9149e2fcfba32"
SRC_URI[deb0.md5sum] = "cf801810b79cc273a2177d7eca23a1cf"

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
