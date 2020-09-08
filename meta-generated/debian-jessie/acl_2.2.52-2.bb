PACKAGES = "${PN} libacl1"
PROVIDES = "libacl1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/a/acl/libacl1_2.2.52-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libacl1 = "libacl1_2.2.52-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "f16dc508fb664be6320514ac7c0ccedbdd67848eb6d284478719b5e842179e08"
SRC_URI[deb0.md5sum] = "64e427c004dad7ee58f0b81ed59b638a"

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
