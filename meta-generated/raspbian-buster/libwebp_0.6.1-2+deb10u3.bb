PACKAGES = "${PN} libwebp6"
PROVIDES = "libwebp6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libw/libwebp/libwebp6_0.6.1-2+deb10u3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libwebp6 = "libwebp6_0.6.1-2+deb10u3_armhf.deb"
SRC_URI[deb0.sha256sum] = "6e82f5ffe13a576c10dad4b747d32069d20e9d754f60c456ac18381a59a27334"
SRC_URI[deb0.md5sum] = "c31bbb401ea94be10d7a5d586d094067"

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
