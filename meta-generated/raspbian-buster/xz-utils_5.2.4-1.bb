PACKAGES = "${PN} liblzma5"
PROVIDES = "liblzma5"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/x/xz-utils/liblzma5_5.2.4-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_liblzma5 = "liblzma5_5.2.4-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "825babb4ce905472493d6f26a5ec6dfa055447f3a9f4b3418cec9e0d56681f03"
SRC_URI[deb0.md5sum] = "a73f36b2df4cd0d52218da574295c44a"

RDEPENDS_liblzma5 = "libc6 (>= 2.17)"
DEPENDS = "libc6"


inherit deb_group

FILES_liblzma5 = " \
    ./lib/arm-linux-gnueabihf/liblzma.so.5 \
    ./lib/arm-linux-gnueabihf/liblzma.so.5.2.4 \
    ./usr/share/doc/liblzma5/AUTHORS \
    ./usr/share/doc/liblzma5/NEWS.gz \
    ./usr/share/doc/liblzma5/THANKS \
    ./usr/share/doc/liblzma5/changelog.Debian.gz \
    ./usr/share/doc/liblzma5/changelog.gz \
    ./usr/share/doc/liblzma5/copyright\
"
