PACKAGES = "${PN} libjpeg62-turbo"
PROVIDES = "libjpeg62-turbo"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libj/libjpeg-turbo/libjpeg62-turbo_1.5.2-2+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libjpeg62-turbo = "libjpeg62-turbo_1.5.2-2+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "da47786028e33fdd222cc2d49cf7943c412b1bd1e97ed71695daec343b9ce7ba"
SRC_URI[deb0.md5sum] = "32184f9a6125aa574ee7168f32b810ee"

RDEPENDS_libjpeg62-turbo = "libc6 (>= 2.7)"
DEPENDS = "libc6"


inherit deb_group

FILES_libjpeg62-turbo = " \
    ./usr/lib/arm-linux-gnueabihf/libjpeg.so.62 \
    ./usr/lib/arm-linux-gnueabihf/libjpeg.so.62.2.0 \
    ./usr/share/doc/libjpeg62-turbo/changelog.Debian.gz \
    ./usr/share/doc/libjpeg62-turbo/changelog.gz \
    ./usr/share/doc/libjpeg62-turbo/copyright \
    ./usr/share/lintian/overrides/libjpeg62-turbo\
"
