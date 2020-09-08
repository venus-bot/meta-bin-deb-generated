PACKAGES = "${PN} libjpeg62-turbo"
PROVIDES = "libjpeg62-turbo"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libj/libjpeg-turbo/libjpeg62-turbo_1.5.2-2+b1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libjpeg62-turbo = "libjpeg62-turbo_1.5.2-2+b1_armhf.deb"
SRC_URI[deb0.sha256sum] = "bc28dbc5b68fe0268aa7692562bb0a39908e1bd0901be1990affd585fec773b3"
SRC_URI[deb0.md5sum] = "caf59d1b64ceffe0a0ae4a6381631d16"

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
