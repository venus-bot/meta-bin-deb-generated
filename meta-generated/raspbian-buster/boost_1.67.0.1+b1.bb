PACKAGES = "${PN} libboost-program-options-dev libboost-regex-dev libboost-system-dev libboost-thread-dev"
PROVIDES = "libboost-program-options-dev libboost-regex-dev libboost-system-dev libboost-thread-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/b/boost-defaults/libboost-program-options-dev_1.67.0.1+b1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/b/boost-defaults/libboost-regex-dev_1.67.0.1+b1_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/b/boost-defaults/libboost-system-dev_1.67.0.1+b1_armhf.deb;unpack=0;name=deb2\
	http://archive.raspbian.org/raspbian/pool/main/b/boost-defaults/libboost-thread-dev_1.67.0.1+b1_armhf.deb;unpack=0;name=deb3\
"
DEBFILENAME_libboost-program-options-dev = "libboost-program-options-dev_1.67.0.1+b1_armhf.deb"
SRC_URI[deb0.sha256sum] = "0819582ff42dbe7a2170197d70f93620cac7961f7099f52bce08eca2f5eae200"
SRC_URI[deb0.md5sum] = "b447f7db23b278937ae494b69fea9e1b"
DEBFILENAME_libboost-regex-dev = "libboost-regex-dev_1.67.0.1+b1_armhf.deb"
SRC_URI[deb1.sha256sum] = "0f75295c6693b4fe6c2cee6cc0055a1d3a2c3db80d7f4367f6288b25db58719e"
SRC_URI[deb1.md5sum] = "6d4f73c9792ec6ee51e1c47fa4a7659f"
DEBFILENAME_libboost-system-dev = "libboost-system-dev_1.67.0.1+b1_armhf.deb"
SRC_URI[deb2.sha256sum] = "44984876309ee2877b83064fd0bc830d35bd267418e41fbf855bfa489cca0c68"
SRC_URI[deb2.md5sum] = "073e603c6a64ebf30575337c652c45c8"
DEBFILENAME_libboost-thread-dev = "libboost-thread-dev_1.67.0.1+b1_armhf.deb"
SRC_URI[deb3.sha256sum] = "cc244cfd06d848a4f5e8304a54fa92f705ee563fc7e0ed520225d1826fd351f5"
SRC_URI[deb3.md5sum] = "04bd9a20d8967692f2645338a7db4f89"

RDEPENDS_lib${PN}-program-options-dev = "libboost-program-options1.67-dev"
RDEPENDS_lib${PN}-regex-dev = "libboost-regex1.67-dev"
RDEPENDS_lib${PN}-system-dev = "libboost-system1.67-dev"
RDEPENDS_lib${PN}-thread-dev = "libboost-thread1.67-dev"
DEPENDS = "libboost-program-options1.67-dev libboost-regex1.67-dev libboost-system1.67-dev libboost-thread1.67-dev"


inherit deb_group

FILES_libboost-program-options-dev = " \
    ./usr/share/doc/libboost-program-options-dev/changelog.armhf.gz \
    ./usr/share/doc/libboost-program-options-dev/changelog.gz \
    ./usr/share/doc/libboost-program-options-dev/copyright\
"
FILES_libboost-regex-dev = " \
    ./usr/share/doc/libboost-regex-dev/changelog.armhf.gz \
    ./usr/share/doc/libboost-regex-dev/changelog.gz \
    ./usr/share/doc/libboost-regex-dev/copyright\
"
FILES_libboost-system-dev = " \
    ./usr/share/doc/libboost-system-dev/changelog.armhf.gz \
    ./usr/share/doc/libboost-system-dev/changelog.gz \
    ./usr/share/doc/libboost-system-dev/copyright\
"
FILES_libboost-thread-dev = " \
    ./usr/share/doc/libboost-thread-dev/changelog.armhf.gz \
    ./usr/share/doc/libboost-thread-dev/changelog.gz \
    ./usr/share/doc/libboost-thread-dev/copyright\
"
