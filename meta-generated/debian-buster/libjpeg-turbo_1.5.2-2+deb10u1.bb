PACKAGES = "${PN} libjpeg62-turbo"
PROVIDES = "libjpeg62-turbo"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libj/libjpeg-turbo/libjpeg62-turbo_1.5.2-2+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libjpeg62-turbo = "libjpeg62-turbo_1.5.2-2+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "866a67057ed0403a8fb9f572eb62c62f839ca8d4ad735211c377a44f92335ffc"
SRC_URI[deb0.md5sum] = "0291a3dbc3d58d0b181e34ddd3166f57"

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
