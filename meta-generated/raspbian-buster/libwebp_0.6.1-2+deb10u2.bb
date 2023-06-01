PACKAGES = "${PN} libwebp6"
PROVIDES = "libwebp6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libw/libwebp/libwebp6_0.6.1-2+deb10u2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libwebp6 = "libwebp6_0.6.1-2+deb10u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "7fcdb7736e392a86ba854fbbbf1304dbe5e7bba55b081a7277f749224e477db9"
SRC_URI[deb0.md5sum] = "fa634cf928298d34bc42213de2d3c1d4"

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
