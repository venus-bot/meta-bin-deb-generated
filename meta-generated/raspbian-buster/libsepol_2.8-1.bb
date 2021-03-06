PACKAGES = "${PN} libsepol1 libsepol1-dev"
PROVIDES = "libsepol1 libsepol1-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libs/libsepol/libsepol1_2.8-1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/libs/libsepol/libsepol1-dev_2.8-1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libsepol1 = "libsepol1_2.8-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "9941f76c1d378ed0322cb413e0340455fe812f6b7451cf86a78065b2e5db69ef"
SRC_URI[deb0.md5sum] = "3d9500c73c807c2accf7713cef541af7"
DEBFILENAME_libsepol1-dev = "libsepol1-dev_2.8-1_armhf.deb"
SRC_URI[deb1.sha256sum] = "bb83006408fa724bd51bb7c680bba624db2201e36dd546167ea40ced0a4b3aa6"
SRC_URI[deb1.md5sum] = "9a2e135c4385bc38e45eb442da978560"

RDEPENDS_${PN}1 = "libc6 (>= 2.8)"
RDEPENDS_${PN}1-dev = "libsepol1 (= 2.8-1)"
DEPENDS = "libc6"


inherit deb_group

FILES_libsepol1 = " \
    ./lib/arm-linux-gnueabihf/libsepol.so.1 \
    ./usr/share/doc/libsepol1/changelog.Debian.gz \
    ./usr/share/doc/libsepol1/copyright\
"
FILES_libsepol1-dev = " \
    ./usr/include/sepol/boolean_record.h \
    ./usr/include/sepol/booleans.h \
    ./usr/include/sepol/cil/cil.h \
    ./usr/include/sepol/context.h \
    ./usr/include/sepol/context_record.h \
    ./usr/include/sepol/debug.h \
    ./usr/include/sepol/errcodes.h \
    ./usr/include/sepol/handle.h \
    ./usr/include/sepol/ibendport_record.h \
    ./usr/include/sepol/ibendports.h \
    ./usr/include/sepol/ibpkey_record.h \
    ./usr/include/sepol/ibpkeys.h \
    ./usr/include/sepol/iface_record.h \
    ./usr/include/sepol/interfaces.h \
    ./usr/include/sepol/kernel_to_cil.h \
    ./usr/include/sepol/kernel_to_conf.h \
    ./usr/include/sepol/module.h \
    ./usr/include/sepol/module_to_cil.h \
    ./usr/include/sepol/node_record.h \
    ./usr/include/sepol/nodes.h \
    ./usr/include/sepol/policydb.h \
    ./usr/include/sepol/policydb/avrule_block.h \
    ./usr/include/sepol/policydb/avtab.h \
    ./usr/include/sepol/policydb/conditional.h \
    ./usr/include/sepol/policydb/constraint.h \
    ./usr/include/sepol/policydb/context.h \
    ./usr/include/sepol/policydb/ebitmap.h \
    ./usr/include/sepol/policydb/expand.h \
    ./usr/include/sepol/policydb/flask.h \
    ./usr/include/sepol/policydb/flask_types.h \
    ./usr/include/sepol/policydb/hashtab.h \
    ./usr/include/sepol/policydb/hierarchy.h \
    ./usr/include/sepol/policydb/link.h \
    ./usr/include/sepol/policydb/mls_types.h \
    ./usr/include/sepol/policydb/module.h \
    ./usr/include/sepol/policydb/polcaps.h \
    ./usr/include/sepol/policydb/policydb.h \
    ./usr/include/sepol/policydb/services.h \
    ./usr/include/sepol/policydb/sidtab.h \
    ./usr/include/sepol/policydb/symtab.h \
    ./usr/include/sepol/policydb/util.h \
    ./usr/include/sepol/port_record.h \
    ./usr/include/sepol/ports.h \
    ./usr/include/sepol/roles.h \
    ./usr/include/sepol/sepol.h \
    ./usr/include/sepol/user_record.h \
    ./usr/include/sepol/users.h \
    ./usr/lib/arm-linux-gnueabihf/libsepol.a \
    ./usr/lib/arm-linux-gnueabihf/libsepol.so \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/libsepol.pc \
    ./usr/share/doc/libsepol1-dev/changelog.Debian.gz \
    ./usr/share/doc/libsepol1-dev/copyright \
    ./usr/share/man/man3/sepol_check_context.3.gz \
    ./usr/share/man/man3/sepol_genbools.3.gz \
    ./usr/share/man/man3/sepol_genusers.3.gz\
"
