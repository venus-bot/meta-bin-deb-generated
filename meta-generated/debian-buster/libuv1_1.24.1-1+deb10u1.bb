PACKAGES = "${PN} libuv1"
PROVIDES = "libuv1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libu/libuv1/libuv1_1.24.1-1+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libuv1 = "libuv1_1.24.1-1+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "01fc3d62b8216eb0a416d924746c6eb15138cb8d5e57c8c10c8deac6a501aa6b"
SRC_URI[deb0.md5sum] = "d9100d33353ae7ea30763282cee76fcc"

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
