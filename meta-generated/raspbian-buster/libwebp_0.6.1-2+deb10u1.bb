PACKAGES = "${PN} libwebp6"
PROVIDES = "libwebp6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libw/libwebp/libwebp6_0.6.1-2+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libwebp6 = "libwebp6_0.6.1-2+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "9594e1aaf881336a020ce68341900e77606b3aed973ef707dad4deb1868f8dbe"
SRC_URI[deb0.md5sum] = "5541d83da178b41bdbf869f26e51a5b1"

RDEPENDS_${PN}6 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

FILES_libwebp6 = " \
    ./usr/lib/arm-linux-gnueabihf/libwebp.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libwebp.so.6.0.2 \
    ./usr/share/doc/libwebp6/changelog.Debian.gz \
    ./usr/share/doc/libwebp6/changelog.gz \
    ./usr/share/doc/libwebp6/copyright\
"
