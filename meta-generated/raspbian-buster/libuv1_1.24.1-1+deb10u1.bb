PACKAGES = "${PN} libuv1"
PROVIDES = "libuv1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libu/libuv1/libuv1_1.24.1-1+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libuv1 = "libuv1_1.24.1-1+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "9900af594cfccaeb13783296a019d912db1be477bcace8cc26a77c5e204a081a"
SRC_URI[deb0.md5sum] = "6585475af707a61f5ebc64e5b48f7085"

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
