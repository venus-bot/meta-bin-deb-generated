PACKAGES = "${PN} liblz4-1"
PROVIDES = "liblz4-1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/l/lz4/liblz4-1_1.8.3-1+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_liblz4-1 = "liblz4-1_1.8.3-1+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "6abeb63c4606696214390c67fce1974ce1f298194b28bfbc2fa1ad7107651501"
SRC_URI[deb0.md5sum] = "b70dc32f354339bb672adc9b12967c3c"

RDEPENDS_lib${PN}-1 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

FILES_liblz4-1 = " \
    ./usr/lib/arm-linux-gnueabihf/liblz4.so.1 \
    ./usr/lib/arm-linux-gnueabihf/liblz4.so.1.8.3 \
    ./usr/share/doc/liblz4-1/changelog.Debian.gz \
    ./usr/share/doc/liblz4-1/copyright\
"
