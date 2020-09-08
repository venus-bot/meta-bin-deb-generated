PACKAGES = "${PN} libacl1"
PROVIDES = "libacl1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/a/acl/libacl1_2.2.52-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libacl1 = "libacl1_2.2.52-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "685a91cf82a376b366e59a8e1fdfe7a7d17c415d19f01e0a614c24580d754836"
SRC_URI[deb0.md5sum] = "b84e292e71a02e8dfd46cb8646a07367"

RDEPENDS_lib${PN}1 = "libattr1 (>= 1:2.4.46-8) libc6 (>= 2.4) multiarch-support"
DEPENDS = "libattr1 libc6 multiarch-support"


inherit deb_group

FILES_libacl1 = " \
    ./lib/arm-linux-gnueabihf/libacl.so.1 \
    ./lib/arm-linux-gnueabihf/libacl.so.1.1.0 \
    ./usr/share/doc/libacl1/changelog.Debian.gz \
    ./usr/share/doc/libacl1/changelog.gz \
    ./usr/share/doc/libacl1/copyright\
"
