PACKAGES = "${PN} liblz4-1"
PROVIDES = "liblz4-1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/l/lz4/liblz4-1_1.8.3-1+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_liblz4-1 = "liblz4-1_1.8.3-1+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "84296d58a8df0342d7e24c582657b088d75967a40a9e9af1fabc3083215b5edc"
SRC_URI[deb0.md5sum] = "fe3cbc3d76b7169561ff300e99e335b8"

RDEPENDS_lib${PN}-1 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

FILES_liblz4-1 = " \
    ./usr/lib/arm-linux-gnueabihf/liblz4.so.1 \
    ./usr/lib/arm-linux-gnueabihf/liblz4.so.1.8.3 \
    ./usr/share/doc/liblz4-1/changelog.Debian.gz \
    ./usr/share/doc/liblz4-1/copyright\
"
