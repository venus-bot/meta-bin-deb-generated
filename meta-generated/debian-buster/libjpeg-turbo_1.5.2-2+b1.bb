PACKAGES = "${PN} libjpeg62-turbo"
PROVIDES = "libjpeg62-turbo"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libj/libjpeg-turbo/libjpeg62-turbo_1.5.2-2+b1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libjpeg62-turbo = "libjpeg62-turbo_1.5.2-2+b1_armhf.deb"
SRC_URI[deb0.sha256sum] = "45cf3c9f8d4395a0b9341ab76e3ec475b9661b152abfdb93fb7279d7b2b59df1"
SRC_URI[deb0.md5sum] = "6ebdbae7bf7c337c3a2083f032670618"

RDEPENDS_libjpeg62-turbo = "libc6 (>= 2.7)"
DEPENDS = "libc6"


inherit deb_group

FILES_libjpeg62-turbo = " \
    ./usr/lib/arm-linux-gnueabihf/libjpeg.so.62 \
    ./usr/lib/arm-linux-gnueabihf/libjpeg.so.62.2.0 \
    ./usr/share/doc/libjpeg62-turbo/changelog.Debian.armhf.gz \
    ./usr/share/doc/libjpeg62-turbo/changelog.Debian.gz \
    ./usr/share/doc/libjpeg62-turbo/changelog.gz \
    ./usr/share/doc/libjpeg62-turbo/copyright \
    ./usr/share/lintian/overrides/libjpeg62-turbo\
"
