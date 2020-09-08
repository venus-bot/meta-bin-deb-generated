PACKAGES = "${PN} liblz4-1"
PROVIDES = "liblz4-1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/l/lz4/liblz4-1_1.8.3-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_liblz4-1 = "liblz4-1_1.8.3-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "99661a8b347d55fc0212b8176f691eaee1e13e2ee75aa316c549ac669fe77925"
SRC_URI[deb0.md5sum] = "036033658e4bac398ef2ba9bdc94231f"

RDEPENDS_lib${PN}-1 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

FILES_liblz4-1 = " \
    ./usr/lib/arm-linux-gnueabihf/liblz4.so.1 \
    ./usr/lib/arm-linux-gnueabihf/liblz4.so.1.8.3 \
    ./usr/share/doc/liblz4-1/changelog.Debian.gz \
    ./usr/share/doc/liblz4-1/copyright\
"
