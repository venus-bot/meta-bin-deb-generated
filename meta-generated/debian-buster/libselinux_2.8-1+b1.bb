PACKAGES = "${PN} libselinux1 libselinux1-dev"
PROVIDES = "libselinux1 libselinux1-dev"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libs/libselinux/libselinux1_2.8-1+b1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/libs/libselinux/libselinux1-dev_2.8-1+b1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libselinux1 = "libselinux1_2.8-1+b1_armhf.deb"
SRC_URI[deb0.sha256sum] = "6710d31f542d1226f322a92f1b1963d592b8d310e7c06f912591b4dbc7d50178"
SRC_URI[deb0.md5sum] = "923517bb17a264b4f665ec9a4b13a5b8"
DEBFILENAME_libselinux1-dev = "libselinux1-dev_2.8-1+b1_armhf.deb"
SRC_URI[deb1.sha256sum] = "7b8f3b508dc392959f5238c77d1ebe2440074a1b83792f295a9e5e13ffe2f90a"
SRC_URI[deb1.md5sum] = "0b3cb3e092fbf8b4279f0df5ad9908cb"

RDEPENDS_${PN}1 = "libc6 (>= 2.8) libpcre3"
RDEPENDS_${PN}1-dev = "libpcre3-dev libselinux1 (= 2.8-1+b1) libsepol1-dev (>= 2.8)"
DEPENDS = "libc6 libpcre3 libpcre3-dev libsepol1-dev"


inherit deb_group

FILES_libselinux1 = " \
    ./lib/arm-linux-gnueabihf/libselinux.so.1 \
    ./usr/share/doc/libselinux1/changelog.Debian.armhf.gz \
    ./usr/share/doc/libselinux1/changelog.Debian.gz \
    ./usr/share/doc/libselinux1/copyright\
"
FILES_libselinux1-dev = " \
    ./usr/include/selinux/av_permissions.h \
    ./usr/include/selinux/avc.h \
    ./usr/include/selinux/context.h \
    ./usr/include/selinux/flask.h \
    ./usr/include/selinux/get_context_list.h \
    ./usr/include/selinux/get_default_type.h \
    ./usr/include/selinux/label.h \
    ./usr/include/selinux/restorecon.h \
    ./usr/include/selinux/selinux.h \
    ./usr/lib/arm-linux-gnueabihf/libselinux.a \
    ./usr/lib/arm-linux-gnueabihf/libselinux.so \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/libselinux.pc \
    ./usr/share/doc/libselinux1-dev/changelog.Debian.armhf.gz \
    ./usr/share/doc/libselinux1-dev/changelog.Debian.gz \
    ./usr/share/doc/libselinux1-dev/copyright \
    ./usr/share/man/man3/avc_add_callback.3.gz \
    ./usr/share/man/man3/avc_audit.3.gz \
    ./usr/share/man/man3/avc_av_stats.3.gz \
    ./usr/share/man/man3/avc_cache_stats.3.gz \
    ./usr/share/man/man3/avc_cleanup.3.gz \
    ./usr/share/man/man3/avc_compute_create.3.gz \
    ./usr/share/man/man3/avc_compute_member.3.gz \
    ./usr/share/man/man3/avc_context_to_sid.3.gz \
    ./usr/share/man/man3/avc_destroy.3.gz \
    ./usr/share/man/man3/avc_entry_ref_init.3.gz \
    ./usr/share/man/man3/avc_get_initial_context.3.gz \
    ./usr/share/man/man3/avc_get_initial_sid.3.gz \
    ./usr/share/man/man3/avc_has_perm.3.gz \
    ./usr/share/man/man3/avc_has_perm_noaudit.3.gz \
    ./usr/share/man/man3/avc_init.3.gz \
    ./usr/share/man/man3/avc_netlink_acquire_fd.3.gz \
    ./usr/share/man/man3/avc_netlink_check_nb.3.gz \
    ./usr/share/man/man3/avc_netlink_close.3.gz \
    ./usr/share/man/man3/avc_netlink_loop.3.gz \
    ./usr/share/man/man3/avc_netlink_open.3.gz \
    ./usr/share/man/man3/avc_netlink_release_fd.3.gz \
    ./usr/share/man/man3/avc_open.3.gz \
    ./usr/share/man/man3/avc_reset.3.gz \
    ./usr/share/man/man3/avc_sid_stats.3.gz \
    ./usr/share/man/man3/avc_sid_to_context.3.gz \
    ./usr/share/man/man3/checkPasswdAccess.3.gz \
    ./usr/share/man/man3/context_free.3.gz \
    ./usr/share/man/man3/context_new.3.gz \
    ./usr/share/man/man3/context_range_get.3.gz \
    ./usr/share/man/man3/context_range_set.3.gz \
    ./usr/share/man/man3/context_role_get.3.gz \
    ./usr/share/man/man3/context_role_set.3.gz \
    ./usr/share/man/man3/context_type_get.3.gz \
    ./usr/share/man/man3/context_type_set.3.gz \
    ./usr/share/man/man3/context_user_get.3.gz \
    ./usr/share/man/man3/context_user_set.3.gz \
    ./usr/share/man/man3/fgetfilecon.3.gz \
    ./usr/share/man/man3/fgetfilecon_raw.3.gz \
    ./usr/share/man/man3/fini_selinuxmnt.3.gz \
    ./usr/share/man/man3/freecon.3.gz \
    ./usr/share/man/man3/freeconary.3.gz \
    ./usr/share/man/man3/fsetfilecon.3.gz \
    ./usr/share/man/man3/fsetfilecon_raw.3.gz \
    ./usr/share/man/man3/get_default_context.3.gz \
    ./usr/share/man/man3/get_default_context_with_level.3.gz \
    ./usr/share/man/man3/get_default_context_with_role.3.gz \
    ./usr/share/man/man3/get_default_context_with_rolelevel.3.gz \
    ./usr/share/man/man3/get_default_type.3.gz \
    ./usr/share/man/man3/get_ordered_context_list.3.gz \
    ./usr/share/man/man3/get_ordered_context_list_with_level.3.gz \
    ./usr/share/man/man3/getcon.3.gz \
    ./usr/share/man/man3/getcon_raw.3.gz \
    ./usr/share/man/man3/getexeccon.3.gz \
    ./usr/share/man/man3/getexeccon_raw.3.gz \
    ./usr/share/man/man3/getfilecon.3.gz \
    ./usr/share/man/man3/getfilecon_raw.3.gz \
    ./usr/share/man/man3/getfscreatecon.3.gz \
    ./usr/share/man/man3/getfscreatecon_raw.3.gz \
    ./usr/share/man/man3/getkeycreatecon.3.gz \
    ./usr/share/man/man3/getkeycreatecon_raw.3.gz \
    ./usr/share/man/man3/getpeercon.3.gz \
    ./usr/share/man/man3/getpeercon_raw.3.gz \
    ./usr/share/man/man3/getpidcon.3.gz \
    ./usr/share/man/man3/getpidcon_raw.3.gz \
    ./usr/share/man/man3/getprevcon.3.gz \
    ./usr/share/man/man3/getprevcon_raw.3.gz \
    ./usr/share/man/man3/getseuserbyname.3.gz \
    ./usr/share/man/man3/getsockcreatecon.3.gz \
    ./usr/share/man/man3/getsockcreatecon_raw.3.gz \
    ./usr/share/man/man3/init_selinuxmnt.3.gz \
    ./usr/share/man/man3/is_context_customizable.3.gz \
    ./usr/share/man/man3/is_selinux_enabled.3.gz \
    ./usr/share/man/man3/is_selinux_mls_enabled.3.gz \
    ./usr/share/man/man3/lgetfilecon.3.gz \
    ./usr/share/man/man3/lgetfilecon_raw.3.gz \
    ./usr/share/man/man3/lsetfilecon.3.gz \
    ./usr/share/man/man3/lsetfilecon_raw.3.gz \
    ./usr/share/man/man3/manual_user_enter_context.3.gz \
    ./usr/share/man/man3/matchmediacon.3.gz \
    ./usr/share/man/man3/matchpathcon.3.gz \
    ./usr/share/man/man3/matchpathcon_checkmatches.3.gz \
    ./usr/share/man/man3/matchpathcon_filespec_add.3.gz \
    ./usr/share/man/man3/matchpathcon_filespec_destroy.3.gz \
    ./usr/share/man/man3/matchpathcon_filespec_eval.3.gz \
    ./usr/share/man/man3/matchpathcon_fini.3.gz \
    ./usr/share/man/man3/matchpathcon_index.3.gz \
    ./usr/share/man/man3/matchpathcon_init.3.gz \
    ./usr/share/man/man3/mode_to_security_class.3.gz \
    ./usr/share/man/man3/print_access_vector.3.gz \
    ./usr/share/man/man3/query_user_context.3.gz \
    ./usr/share/man/man3/rpm_execcon.3.gz \
    ./usr/share/man/man3/security_av_perm_to_string.3.gz \
    ./usr/share/man/man3/security_av_string.3.gz \
    ./usr/share/man/man3/security_check_context.3.gz \
    ./usr/share/man/man3/security_check_context_raw.3.gz \
    ./usr/share/man/man3/security_class_to_string.3.gz \
    ./usr/share/man/man3/security_commit_booleans.3.gz \
    ./usr/share/man/man3/security_compute_av.3.gz \
    ./usr/share/man/man3/security_compute_av_flags.3.gz \
    ./usr/share/man/man3/security_compute_av_flags_raw.3.gz \
    ./usr/share/man/man3/security_compute_av_raw.3.gz \
    ./usr/share/man/man3/security_compute_create.3.gz \
    ./usr/share/man/man3/security_compute_create_name.3.gz \
    ./usr/share/man/man3/security_compute_create_name_raw.3.gz \
    ./usr/share/man/man3/security_compute_create_raw.3.gz \
    ./usr/share/man/man3/security_compute_member.3.gz \
    ./usr/share/man/man3/security_compute_member_raw.3.gz \
    ./usr/share/man/man3/security_compute_relabel.3.gz \
    ./usr/share/man/man3/security_compute_relabel_raw.3.gz \
    ./usr/share/man/man3/security_compute_user.3.gz \
    ./usr/share/man/man3/security_compute_user_raw.3.gz \
    ./usr/share/man/man3/security_deny_unknown.3.gz \
    ./usr/share/man/man3/security_disable.3.gz \
    ./usr/share/man/man3/security_get_boolean_active.3.gz \
    ./usr/share/man/man3/security_get_boolean_names.3.gz \
    ./usr/share/man/man3/security_get_boolean_pending.3.gz \
    ./usr/share/man/man3/security_get_initial_context.3.gz \
    ./usr/share/man/man3/security_get_initial_context_raw.3.gz \
    ./usr/share/man/man3/security_getenforce.3.gz \
    ./usr/share/man/man3/security_load_booleans.3.gz \
    ./usr/share/man/man3/security_load_policy.3.gz \
    ./usr/share/man/man3/security_mkload_policy.3.gz \
    ./usr/share/man/man3/security_policyvers.3.gz \
    ./usr/share/man/man3/security_set_boolean.3.gz \
    ./usr/share/man/man3/security_setenforce.3.gz \
    ./usr/share/man/man3/selabel_close.3.gz \
    ./usr/share/man/man3/selabel_digest.3.gz \
    ./usr/share/man/man3/selabel_lookup.3.gz \
    ./usr/share/man/man3/selabel_lookup_best_match.3.gz \
    ./usr/share/man/man3/selabel_lookup_best_match_raw.3.gz \
    ./usr/share/man/man3/selabel_lookup_raw.3.gz \
    ./usr/share/man/man3/selabel_open.3.gz \
    ./usr/share/man/man3/selabel_partial_match.3.gz \
    ./usr/share/man/man3/selabel_stats.3.gz \
    ./usr/share/man/man3/selinux_binary_policy_path.3.gz \
    ./usr/share/man/man3/selinux_boolean_sub.3.gz \
    ./usr/share/man/man3/selinux_booleans_path.3.gz \
    ./usr/share/man/man3/selinux_check_access.3.gz \
    ./usr/share/man/man3/selinux_check_passwd_access.3.gz \
    ./usr/share/man/man3/selinux_check_securetty_context.3.gz \
    ./usr/share/man/man3/selinux_colors_path.3.gz \
    ./usr/share/man/man3/selinux_contexts_path.3.gz \
    ./usr/share/man/man3/selinux_current_policy_path.3.gz \
    ./usr/share/man/man3/selinux_default_context_path.3.gz \
    ./usr/share/man/man3/selinux_default_type_path.3.gz \
    ./usr/share/man/man3/selinux_failsafe_context_path.3.gz \
    ./usr/share/man/man3/selinux_file_context_cmp.3.gz \
    ./usr/share/man/man3/selinux_file_context_homedir_path.3.gz \
    ./usr/share/man/man3/selinux_file_context_local_path.3.gz \
    ./usr/share/man/man3/selinux_file_context_path.3.gz \
    ./usr/share/man/man3/selinux_file_context_verify.3.gz \
    ./usr/share/man/man3/selinux_getenforcemode.3.gz \
    ./usr/share/man/man3/selinux_getpolicytype.3.gz \
    ./usr/share/man/man3/selinux_homedir_context_path.3.gz \
    ./usr/share/man/man3/selinux_init_load_policy.3.gz \
    ./usr/share/man/man3/selinux_lsetfilecon_default.3.gz \
    ./usr/share/man/man3/selinux_media_context_path.3.gz \
    ./usr/share/man/man3/selinux_mkload_policy.3.gz \
    ./usr/share/man/man3/selinux_netfilter_context_path.3.gz \
    ./usr/share/man/man3/selinux_path.3.gz \
    ./usr/share/man/man3/selinux_policy_root.3.gz \
    ./usr/share/man/man3/selinux_raw_context_to_color.3.gz \
    ./usr/share/man/man3/selinux_removable_context_path.3.gz \
    ./usr/share/man/man3/selinux_restorecon.3.gz \
    ./usr/share/man/man3/selinux_restorecon_default_handle.3.gz \
    ./usr/share/man/man3/selinux_restorecon_set_alt_rootpath.3.gz \
    ./usr/share/man/man3/selinux_restorecon_set_exclude_list.3.gz \
    ./usr/share/man/man3/selinux_restorecon_set_sehandle.3.gz \
    ./usr/share/man/man3/selinux_restorecon_xattr.3.gz \
    ./usr/share/man/man3/selinux_securetty_types_path.3.gz \
    ./usr/share/man/man3/selinux_set_callback.3.gz \
    ./usr/share/man/man3/selinux_set_mapping.3.gz \
    ./usr/share/man/man3/selinux_set_policy_root.3.gz \
    ./usr/share/man/man3/selinux_status_close.3.gz \
    ./usr/share/man/man3/selinux_status_deny_unknown.3.gz \
    ./usr/share/man/man3/selinux_status_getenforce.3.gz \
    ./usr/share/man/man3/selinux_status_open.3.gz \
    ./usr/share/man/man3/selinux_status_policyload.3.gz \
    ./usr/share/man/man3/selinux_status_updated.3.gz \
    ./usr/share/man/man3/selinux_user_contexts_path.3.gz \
    ./usr/share/man/man3/selinux_usersconf_path.3.gz \
    ./usr/share/man/man3/selinux_x_context_path.3.gz \
    ./usr/share/man/man3/set_matchpathcon_flags.3.gz \
    ./usr/share/man/man3/set_matchpathcon_invalidcon.3.gz \
    ./usr/share/man/man3/set_matchpathcon_printf.3.gz \
    ./usr/share/man/man3/set_selinuxmnt.3.gz \
    ./usr/share/man/man3/setcon.3.gz \
    ./usr/share/man/man3/setcon_raw.3.gz \
    ./usr/share/man/man3/setexeccon.3.gz \
    ./usr/share/man/man3/setexeccon_raw.3.gz \
    ./usr/share/man/man3/setfilecon.3.gz \
    ./usr/share/man/man3/setfilecon_raw.3.gz \
    ./usr/share/man/man3/setfscreatecon.3.gz \
    ./usr/share/man/man3/setfscreatecon_raw.3.gz \
    ./usr/share/man/man3/setkeycreatecon.3.gz \
    ./usr/share/man/man3/setkeycreatecon_raw.3.gz \
    ./usr/share/man/man3/setsockcreatecon.3.gz \
    ./usr/share/man/man3/setsockcreatecon_raw.3.gz \
    ./usr/share/man/man3/sidget.3.gz \
    ./usr/share/man/man3/sidput.3.gz \
    ./usr/share/man/man3/string_to_av_perm.3.gz \
    ./usr/share/man/man3/string_to_security_class.3.gz\
"
