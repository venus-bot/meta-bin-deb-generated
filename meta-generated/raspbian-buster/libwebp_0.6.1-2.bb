PACKAGES = "${PN} libwebp6"
PROVIDES = "libwebp6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libw/libwebp/libwebp6_0.6.1-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libwebp6 = "libwebp6_0.6.1-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "979fc61f16f7887e4ad602a7df402ed8f12d461fda376fde31de90873920494f"
SRC_URI[deb0.md5sum] = "d980baf892638ceb52bb0b33516d11fc"

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
